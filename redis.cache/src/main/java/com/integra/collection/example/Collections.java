package com.integra.collection.example;

import java.util.ArrayList;

public class Collections
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Rock");
		arrayList.add("Paper");
		arrayList.add("Scissors");

		System.out.println("Elements in Arralist : "+ arrayList);
		System.out.println("Inserting elements using index");

		arrayList.add(3,"Shoot"); //If index is not present in order, Exception will be thrown

		//	arrayList.add(5,"Shoot");    This will throw exception

		System.out.println("Elements in Arralist : "+ arrayList);

	}

}

