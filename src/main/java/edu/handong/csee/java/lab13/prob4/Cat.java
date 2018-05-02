package edu.handong.csee.java.lab13.prob4;	//prob4. package name

//Cat class is created and also inherit Animal parent class.
public class Cat extends Animal implements Pet{	
	
	public String food() {	//food method's return type is string.
		return "(Cat!)" + "Fish";	//returns text
	}
	
	
}
