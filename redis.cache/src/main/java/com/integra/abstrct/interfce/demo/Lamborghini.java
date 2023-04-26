package com.integra.abstrct.interfce.demo;

public class Lamborghini extends Design implements Vehicle,Dummy
{

	@Override
	public void start()
	{
		System.out.println("Lambo has started");

	}

	@Override
	public void stop()
	{
		System.out.println("Lambo has started");
	}

	@Override
	public void price()
	{
		System.out.println("Lambo price is 7CR");
	}

	@Override
	public void brandName()
	{
		System.out.println("Brand name is Lamborghini");
	}

	@Override
	public void engine()
	{

		System.out.println("Lambo has engine power of 700 HP");
	}

	@Override
	public void aeroDynamics()
	{
		System.out.println("Lamborghini has sharp edge body");
	}

}
