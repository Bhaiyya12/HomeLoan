package com.cjc.homeloan.webapp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloan.webapp.main.model.SanctionLetter;


@Repository
public interface SanctionLetterRepository extends JpaRepository<SanctionLetter, Integer> {

}
