package com.zohocrm.Service;

import java.util.List;

import com.zohocrm.Entity.Leads;

public interface LeadService {
	
	public void saveOneLead(Leads lead);

	public Leads findLeadById(long id);

	public void deleteLeadById(long id);

	public List<Leads> listAllLeads();

}
