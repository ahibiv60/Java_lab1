package com.demo;

public class Perforator 
{
	// Основні поля
	public int numberOfRevolutions; 				// Кількість обертів
	public int frequencyOfStrokes;   				// Частота ударів
	public String color;      						// Колір
	public String producer;          				// Виробник
	
	// Додаткові поля
	private String name;              				// Назва
	private int price;        		  				// Ціна
	protected int weight;							// Вага
	protected String typeOfCartridge;				// Тип патрона
	public static int power;						// Потужність
	
	///////////////////////////////////////Конструктори////////////////////////////////////////////////
	
	public Perforator(){
		//Дефолтний конструктор
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
	//////////////////////////////////////Сетери/гетери////////////////////////////////////////////////////
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
	//////////////////////////////////////////Методи//////////////////////////////////////////////////
	public String toString()
	{
		return String.format("Назва: %s\nКолір: %s\nВиробник: %s\nКількість обертів: %d\nЧастота ударів: %d\nВага: %d\nТип патрона: %s\nПотужність: %d\nЦіна: %d\n", name, color, producer, numberOfRevolutions, frequencyOfStrokes, weight, typeOfCartridge, power, price);
	}
	public static void printStaticPower()
	{
		System.out.println("Потужність: "+power);
	}
	public void printPower()
	{
		System.out.println("Потужність: "+power);
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


