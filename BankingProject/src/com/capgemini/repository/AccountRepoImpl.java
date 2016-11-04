package com.capgemini.repository;

import com.capgemini.model.Account;
import com.capgemini.model.Customer;

public class AccountRepoImpl implements AccountRepository{

	Customer cust=new Customer();
	Account account1=new Account();
	
	
	@Override
	public boolean save(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account searchAccount(int accouuntNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

}
