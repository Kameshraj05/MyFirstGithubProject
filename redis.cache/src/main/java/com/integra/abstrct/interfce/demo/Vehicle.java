package com.integra.abstrct.interfce.demo;

public interface Vehicle
{

	int n = 10;
	void start();
	void stop();
	void price();
	void brandName();


	default void test() {											//This can be accessed by sub classes
		System.out.println("Test method in Interface");
	}

	static void test1() {											//This can be accessed with interface name
		System.out.println("Static method in interface");
	}
}
