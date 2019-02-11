package com.demo;

public class PerforatorDemo {

	public static void main(String[] args) 
	{
		Perforator perforator_1 = new Perforator();
		Perforator perforator_2 = new Perforator(12000, 4600, "White", "Makita");
		Perforator perforator_3 = new Perforator(11000, 4500, "Black", "Makita", "HR2470", 4099, 2, "SDS+", 780);
		
		System.out.println("Perforator #1");
		System.out.println(perforator_1.toString());
		System.out.println("Perforator #2");
		System.out.println(perforator_2.toString());
		System.out.println("Perforator #3");
		System.out.println(perforator_3.toString());
		
		perforator_1.printStaticPower();
		perforator_2.printStaticPower();
		perforator_3.printStaticPower();
		
		perforator_1.printPower();
		perforator_2.printPower();
		perforator_3.printPower();
	}
}