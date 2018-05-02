package edu.handong.csee.java.lab13.prob6;	//prob6. package name

public class Printer {	//Printer is a class, which is blueprint of object

	public static void print(Object object) {	//static method 'print'
		String string = object.toString();	//calls method named toString

		//instanceof checks object type. If result is true,
		if(object instanceof CapitalPrint)	
			string = string.toUpperCase();	//changes into uppercase letters
		System.out.println(string);	//prints string whether upper or lower

	}
}
