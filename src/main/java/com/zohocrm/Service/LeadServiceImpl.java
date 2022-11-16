package com.zohocrm.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Entity.Leads;
import com.zohocrm.Repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Leads lead) {
		leadRepo.save(lead);

	}

	@Override
	public Leads findLeadById(long id) {
		 Optional<Leads> findById = leadRepo.findById(id);
		 Leads leads = findById.get();
		
		   return leads;
	}

	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Leads> listAllLeads() {
		List<Leads> leads = leadRepo.findAll();
		return leads;
		
	}

}
