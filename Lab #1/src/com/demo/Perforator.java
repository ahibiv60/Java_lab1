package com.demo;

public class Perforator 
{
	// ������ ����
	public int numberOfRevolutions; 				// ʳ������ ������
	public int frequencyOfStrokes;   				// ������� �����
	public String color;      						// ����
	public String producer;          				// ��������
	
	// �������� ����
	private String name;              				// �����
	private int price;        		  				// ֳ��
	protected int weight;							// ����
	protected String typeOfCartridge;				// ��� �������
	public static int power;						// ���������
	
	///////////////////////////////////////������������////////////////////////////////////////////////
	
	public Perforator(){
		//��������� �����������
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
	//////////////////////////////////////������/������////////////////////////////////////////////////////
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
	//////////////////////////////////////////������//////////////////////////////////////////////////
	public String toString()
	{
		return String.format("�����: %s\n����: %s\n��������: %s\nʳ������ ������: %d\n������� �����: %d\n����: %d\n��� �������: %s\n���������: %d\nֳ��: %d\n", name, color, producer, numberOfRevolutions, frequencyOfStrokes, weight, typeOfCartridge, power, price);
	}
	public static void printStaticPower()
	{
		System.out.println("���������: "+power);
	}
	public void printPower()
	{
		System.out.println("���������: "+power);
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


