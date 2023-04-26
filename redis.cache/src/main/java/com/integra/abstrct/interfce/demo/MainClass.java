package com.integra.abstrct.interfce.demo;

public class MainClass
{

	public static void main(String[] args)
	{
		System.out.println("BMW implements Vehicle========================");
		Vehicle bmw = new BMW();
		bmw.brandName();
		bmw.start();
		bmw.price();
		bmw.stop();
		bmw.test();
		System.out.println("BMW extends Design implemnts Vehicle============================");
		BMW design = new BMW();
		design.brandName();
		design.start();
		design.price();
		design.engine();
		design.fuel();
		design.aeroDynamics();
		design.stop();
		System.out.println("Lamborghini implements Vehicle===============================");
		Vehicle lambo = new Lamborghini();
		lambo.brandName();
		lambo.start();
		lambo.price();
		lambo.stop();
		System.out.println("BMW extends Design implemnts Vehicle================================");
		Lamborghini designLambo = new Lamborghini();
		designLambo.brandName();
		designLambo.start();
		designLambo.price();
		designLambo.engine();
		designLambo.fuel();
		designLambo.aeroDynamics();
		designLambo.stop();

		Vehicle.test1();
		//Vehicle vehicle = new Vehicle();
		//BMW b = new Design();
	}

}
