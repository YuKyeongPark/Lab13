package edu.handong.csee.java.lab13.prob3;	//prob3. package name

public abstract class Figure {	//abstract class Figure
	public abstract double area();	//abstract double type area method
	public abstract double perimeter();	//abstract double type perimeter method
	
	public void display() {	//method to show information area and perimeter
		System.out.println("Area: " + area());	//prints area
		System.out.println("Perimeter: " + perimeter());	//prints perimeter
	}
	
}
