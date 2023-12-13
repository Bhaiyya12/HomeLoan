package com.cjc.homeloan.webapp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloan.webapp.main.model.PreviousLoan;


@Repository
public interface PreviousLoanRepository extends JpaRepository<PreviousLoan, Integer>{

}
