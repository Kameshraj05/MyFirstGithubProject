package com.demo.redis.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CustomerServiceImpl implements CustomerService
{



	@Autowired
	private CustomerDao customerDao;

	@Override
	public boolean saveCustomer(Customer customer)
	{
		System.out.println("Entered into Service");
		return this.customerDao.saveCustomer(customer);
	}

	@Override
	//@Cacheable("myCache")
	public Customer getCustomer(Integer id)
	{

		System.out.println("Entered into Service");
		Customer customer = this.customerDao.getCustomer(id);
		System.out.println("Ending  Service");
		return customer;
	}

}

