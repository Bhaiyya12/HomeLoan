package com.cjc.homeloan.webapp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.homeloan.webapp.main.model.DependentInfo;


@Repository
public interface DependentInfoRepository extends JpaRepository<DependentInfo, Integer> {

}
