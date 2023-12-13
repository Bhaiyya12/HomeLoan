package com.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.LocalAddress;

@Repository
public interface LocalAddressRepository extends JpaRepository<LocalAddress, Integer>{

}
