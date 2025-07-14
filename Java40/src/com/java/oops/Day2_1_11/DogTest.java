package com.java.oops.Day2_1_11;

class Dog
{
	String name;
	double height;
	int age;

	public void getDogInformation(){
		
		System.out.println("Dog information");
		System.out.println("Dog name: "+name);
		System.out.println("Dog height "+height +" meter");
		System.out.println("Dog age: "+age+" months");
	}

	public void bark(){
		System.out.println(name+" bhoo bhoo!!");
	}
}
public class  DogTest
{
	public static void main(String[] args) 
	{
		Dog dog = new Dog();

		dog.name="happy";
		dog.height =0.6;
		dog.age=24;

		dog.getDogInformation();
		dog.bark();

	}
}
