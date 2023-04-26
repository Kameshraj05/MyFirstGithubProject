package com.demo.redis.cache;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;


@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public boolean saveCustomer(Customer customer)
	{
		try {
			System.out.println("Entered into DAO in saveCustomer");

			this.entityManager.persist(customer);
			System.out.println("Successfully saved");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Customer getCustomer(Integer id){
		Customer customers =  new Customer();
		System.out.println("Entered into DAO");
		System.out.println(id);
		Query query = this.entityManager.createQuery("from Customer where customerId=:id", Customer.class);
		query.setParameter("id", id);
		System.out.println("Query Fetched");
		customers = (Customer) query.getSingleResult();
		//customers = (Customer) this.redisTemplate.opsForValue().get("CUS"+id);
		System.out.println(customers);
		return customers;
	}
}
