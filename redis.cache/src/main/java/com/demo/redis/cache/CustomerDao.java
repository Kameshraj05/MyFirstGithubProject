package com.demo.redis.cache;

public interface CustomerDao
{

	public boolean saveCustomer(Customer customer);

	public Customer getCustomer(Integer id);
}

