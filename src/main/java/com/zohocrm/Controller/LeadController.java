package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Entity.Contacts;
import com.zohocrm.Entity.Leads;
import com.zohocrm.Service.ContactsService;
import com.zohocrm.Service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactsService contactService;
	
	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		return"create_lead";
	}
	
	 @RequestMapping("/savelead")
	 public String saveLead(@ModelAttribute("lead")Leads lead,Model model) {
		   leadservice.saveOneLead(lead);      
		   model.addAttribute("lead",lead);
		 return"view_lead";
	 }
         
	 @RequestMapping("/convertLead")
	 public String ConvertLead(@RequestParam("id")long id,Model model) {
		 Leads leads=leadservice.findLeadById(id);
		  Contacts contacts =new Contacts();
		    contacts.setFirstname(leads.getFirstname());
		    contacts.setLastname(leads.getLastname());
		    contacts.setEmail(leads.getEmail());
		    contacts.setMobile(leads.getMobile());
		    contacts.setSource(leads.getSource());
		    
		    contactService.saveContact(contacts);
		    
		    leadservice.deleteLeadById(id);
		        List<Contacts> contact = contactService.listAll();
		          model.addAttribute("contact", contact);
		    
		 return"list_contacts";
	 }
	 
	 @RequestMapping("/listAll")
	 public String listAllLead(Model model) {
		  List<Leads> leads = leadservice.listAllLeads();
		  model.addAttribute("leads", leads);
		  return"list_lead";
	 }
	 
}

















