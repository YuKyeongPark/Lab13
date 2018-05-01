package edu.handong.csee.java.lab13.prob3;	//prob3. package name

import java.util.Scanner;	//import Scanner which exists java

public class Main {	//Main is class name. This class contains main method
	
	public static void main(String[] args) {	//main method
		double n1, n2;	//declares variables n1, n2
		
		Scanner myKeyboard = new Scanner(System.in);	//Scanner instantiation
		
		System.out.println("Enter radius: ");	//prints text
		n1 = myKeyboard.nextDouble();	//user can input to n1 by using myKeyboard
		Circle circle = new Circle(n1);	// instance: creating object circle and type is Circle

		System.out.println("Radius: " + n1);	//prints radius of circle
		circle.display();	//calls Circle class' method
		
		System.out.println("Enter length and width: ");	//prints text
		n1 = myKeyboard.nextDouble();	//user can input to n1 by using myKeyboard
		n2 = myKeyboard.nextDouble();	//user can input to n2 by using myKeyboard
		Rectangle rectangle = new Rectangle(n1, n2);	// instance: creating object rectangle and type is Rectangle
		
		System.out.println("Length: " + rectangle.getLength() + "\nWidth: " + rectangle.getWidth());	//prints Length and width of rectangle
		rectangle.display();//calls Rectangle class' method
		
	}

}
