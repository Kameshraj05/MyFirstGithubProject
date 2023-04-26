package com.integra.abstrct.interfce.demo;

public abstract class Design
{

	public abstract void engine();

	public abstract void aeroDynamics();

	public void fuel() {

		System.out.println("Car is running in petrol");
	}

	public Design() {
		System.out.println("Constructor of abstract class");
	}
}
