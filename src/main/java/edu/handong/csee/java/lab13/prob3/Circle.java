package edu.handong.csee.java.lab13.prob3;	//prob3. package name

//Circle class is created and also inherit Figure parent class.
public class Circle extends Figure{
	private double radius;	//declares private double type radius
	
	//constructor is a initialize method which has same name with class and there is no return type. this constructor has two parameter
	public Circle(double r) {	
		radius = r;	//puts parameter value r into radius variable 
	}
	
	public double area() {	//method to calculate circle's area
		return Math.PI * Math.pow(radius, 2); //return circle's area = PI * radius^2
	}
	
	public double perimeter() {	//method to calculate circle's perimeter
		return 2.0 * Math.PI * radius;	//return circle's perimeter = 2 * PI * radius
	}
	
	public double getRadius() {	//method to return radius
		return radius;	//return circle' radius
	}
	
	

}
