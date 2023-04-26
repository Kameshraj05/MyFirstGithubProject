package com.demo.redis.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController
{
	@Autowired
	private CustomerService customerService;

	@PostMapping ("/customer")
	public ResponseEntity<String> saveCustomer (@RequestBody Customer customer){
		System.out.println("Entered into Controller");
		System.out.println(customer);
		boolean result = this.customerService.saveCustomer(customer);

		if(result) {
			return ResponseEntity.ok("Customer created Successfully");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@PostMapping("/getCustomer")
	@Cacheable("apiCache")
	public String getCustomer(@RequestBody Customer customer)
	{
		System.out.println("Entered into Controller===============");
		Customer customers;
		customers = this.customerService.getCustomer(customer.getCustomerId());
		System.out.println("Ending Controller===============");

		return ResponseEntity.ok(customers).toString();
	}


}















