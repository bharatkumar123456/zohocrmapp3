package com.zohocrm.Service;

import java.util.List;

import com.zohocrm.Entity.Contacts;

public interface ContactsService {
	
	public void saveContact(Contacts contacts);

	public List<Contacts> listAll();

}
