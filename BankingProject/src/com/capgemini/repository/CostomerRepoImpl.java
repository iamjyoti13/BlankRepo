package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Customer;

public class CostomerRepoImpl  implements CustomerRepository{

	Customer cust=new Customer();

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		List<Customer> customer=new ArrayList<>();
		cust.setFirstName("Jyoti");
		cust.setLastName("Solanke");
		customer.add(cust);
		
		return customer;
	}

}
