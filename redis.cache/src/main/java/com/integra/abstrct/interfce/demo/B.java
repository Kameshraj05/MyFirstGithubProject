package com.integra.abstrct.interfce.demo;

public  class B extends A
{
	String usha="bahut pagal";
	void slow()
	{
		System.out.println("slow");
	}
	void wake()
	{
		System.out.println("wake");
	}
	void hide()
	{
		System.out.println("hide");
	}
	void slap()
	{
		System.out.println("slap");
	}
	public static void main(String args[])
	{
		A a = new B();
		a.go();
		a.run();
		a.push();
		System.out.println("a.usha "+a.usha ); //pagal
		A c = new B();
		B b = (B) c;
		System.out.println("b.usha "+b.usha ); //bahut pagal
		b.go();
		b.run();
		b.push();
		b.slap();
		b.slow();
		b.hide();
		b.wake();
	}

}
