package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Email;
import com.zohocrm.util.EmailServiceImpl;

@Controller
public class EmailController {
	@Autowired
	private EmailServiceImpl emailservice;
	
	@RequestMapping("/sendMail")
	public String sendEmail(@RequestParam("email")String email,Model model) {
		 model.addAttribute("email",email);
		return"email_sender";
	}
	
	  @RequestMapping("/triggerEmail")
	  public String sendEmail(Email email,Model model) {
		  emailservice.sendSimpleEmail(email.getEmail(),email.getSubject(),email.getContent());
		  model.addAttribute("msg","mail sent");
		  return"email_sender";
	  }

}
