package com.capgemini.view;

import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;

public class CustomerView {
	
	public static void main(String args[]) {

		CustomerService customerServiceImpl = new CustomerServiceImpl();
		System.out.println(customerServiceImpl.findAll().get(0).getFirstName());
	}

}
