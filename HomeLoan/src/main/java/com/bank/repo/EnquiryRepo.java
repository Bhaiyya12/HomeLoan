package com.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.EnquiryDetails;
@Repository
public interface EnquiryRepo extends JpaRepository<EnquiryDetails, Integer>
{

}
