package edu.handong.csee.java.lab13.prob3;	//prob3. package name

//Rectangle class is created and also inherit Figure parent class.
public class Rectangle extends Figure{
	private double length;	//declares private double type length
	private double width;	//declares private double type width
	
	//constructor is a initialize method which has same name with class and there is no return type. this constructor has two parameter
	public Rectangle(double length, double width) {	
		this.length = length;	//puts parameter value in to Rectangle class' variable length
		this.width = width;	//puts parameter value in to Rectangle class' variable width
	}
	
	public double area() {	//method to calculate rectangle's area
		return length * width;	//return rectangle's area
	}
	
	public double perimeter() {	//method to calculate rectangle's perimeter
		return 2 * length + 2 * width;	//return rectangle's perimeter
	}
	
	public double getLength() {	//method to return length
		return length;	//returns length
	}
	
	public double getWidth() {	//methodd to return width
		return width;	//returns width
	}
}
