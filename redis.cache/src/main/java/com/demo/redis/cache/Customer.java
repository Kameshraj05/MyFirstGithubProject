package com.demo.redis.cache;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "email")
	private String email;
	@Column(name = "biller")
	private String biller;
	@Column(name = "biller_id")
	private int billerId;


	public int getCustomerId()
	{
		return this.customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	public String getCustomerName()
	{
		return this.customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getBiller()
	{
		return this.biller;
	}
	public void setBiller(String biller)
	{
		this.biller = biller;
	}
	public int getBillerId()
	{
		return this.billerId;
	}
	public void setBillerId(int billerId)
	{
		this.billerId = billerId;
	}
	@Override
	public String toString()
	{
		return "Customer [customerId=" + this.customerId + ", customerName="
				+ this.customerName + ", email=" + this.email + ", biller=" + this.biller
				+ ", billerId=" + this.billerId + "]";
	}


}

