package com.integra.abstrct.interfce.demo;

public class BMW extends Design implements Vehicle,Dummy
{

	@Override
	public void start()
	{
		System.out.println("BMW has started");

	}

	@Override
	public void stop()
	{
		System.out.println("BMW has stopped");

	}

	@Override
	public void price()
	{
		System.out.println("BMW price is 2CR");

	}

	@Override
	public void brandName()
	{
		System.out.println("Brand name is BMW");

	}

	@Override
	public void engine()
	{
		System.out.println("BMW has engine power of 500 HP");

	}

	@Override
	public void aeroDynamics()
	{
		System.out.println("BMW has Muscle body");

	}


}
