package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.repository.CostomerRepoImpl;
import com.capgemini.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	CustomerRepository custrepo=new CostomerRepoImpl();
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		//custrepo.findAll();
		return custrepo.findAll();
	}

}
