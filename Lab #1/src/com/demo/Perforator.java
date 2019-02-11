package com.demo;

public class Perforator 
{
	// Main fields
	public int numberOfRevolutions;
	public int frequencyOfStrokes;
	public String color;
	public String producer;
	
	// Additional fields
	private String name;
	private int price;
	protected int weight;
	protected String typeOfCartridge;
	public static int power;
	
	///////////////////////////////////////Constructors////////////////////////////////////////////////
	
	public Perforator(){
		//Default constructor
	}
	
	public Perforator(int numberOfRevolutions, int frequencyOfStrokes, String color, String producer)
	{
		this.numberOfRevolutions = numberOfRevolutions;
		this.frequencyOfStrokes = frequencyOfStrokes;
		this.color = color;
		this.producer = producer;
	}
	
	public Perforator(int numberOfRevolutions, int frequencyOfStrokes, String color, String producer, String name, int price, int weight, String typeOfCartridge, int power)
	{
		this.numberOfRevolutions = numberOfRevolutions;
		this.frequencyOfStrokes = frequencyOfStrokes;
		this.color = color;
		this.producer = producer;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.typeOfCartridge = typeOfCartridge;
		this.power = power;
	}
	//////////////////////////////////////Setters/Getters////////////////////////////////////////////////////
	public void setName(String name) 
   	{
		this.name=name;
    }
	public String getName() 
	{
		return this.name;
    }
	public void setPrice(int price) 
   	{
		this.price=price;
    }
	public int getPrice() 
	{
		return this.price;
    }
	//////////////////////////////////////////Methods//////////////////////////////////////////////////
	public String toString()
	{
		return String.format("Name: %s\nColor: %s\nProducer: %s\nNumber of revolutions: %d\nFrequency of strokes: %d\nWeight: %d\nType of cartridge: %s\nPower: %d\nPrice: %d\n", name, color, producer, numberOfRevolutions, frequencyOfStrokes, weight, typeOfCartridge, power, price);
	}
	public static void printStaticPower()
	{
		System.out.println("Power: "+power);
	}
	public void printPower()
	{
		System.out.println("Power: "+power);
	}
	public void resetValues(int numberOfRevolutions, int frequencyOfStrokes, String color, String producer, String name, int price, int weight, String typeOfCartridge, int power)
	{
		this.numberOfRevolutions = numberOfRevolutions;
		this.frequencyOfStrokes = frequencyOfStrokes;
		this.color = color;
		this.producer = producer;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.typeOfCartridge = typeOfCartridge;
		this.power = power;
	}
}


