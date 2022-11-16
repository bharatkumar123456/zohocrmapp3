package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entity.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts,Long> {

}
