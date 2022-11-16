package com.zohocrm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Entity.Contacts;
import com.zohocrm.Repository.ContactsRepository;

@Service
public class ContactServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepository contactRepo;

	@Override
	public void saveContact(Contacts contacts) {
		contactRepo.save(contacts);

	}

	@Override
	public List<Contacts> listAll() {
		List<Contacts> contact = contactRepo.findAll();
		return contact;
		 
		
	}

}
