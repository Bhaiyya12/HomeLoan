package com.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.AccountDetails;

public interface AccountDetailsRepo extends JpaRepository<AccountDetails, Integer> {

}
