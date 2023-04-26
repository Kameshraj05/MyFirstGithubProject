package com.demo.redis.cache;

public interface CustomerService
{

	boolean saveCustomer(Customer customer);

	Customer getCustomer(Integer id);

}
