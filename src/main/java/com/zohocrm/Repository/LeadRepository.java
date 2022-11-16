package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entity.Leads;

public interface LeadRepository extends JpaRepository<Leads, Long> {

}
