package com.capgemini.service;

import com.capgemini.model.Account;

public interface AccountService {
	
	Account createAccount(Account account);
	
	Account depositeAmount(Account account);

}
