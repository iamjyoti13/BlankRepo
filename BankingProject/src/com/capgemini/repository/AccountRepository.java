package com.capgemini.repository;

import com.capgemini.model.Account;

public interface AccountRepository {
	
	boolean save(Account account);
	Account searchAccount(int accouuntNumber);
	boolean updateAccount(Account account);

}
