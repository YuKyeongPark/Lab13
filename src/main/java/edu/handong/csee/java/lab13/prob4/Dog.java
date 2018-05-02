package edu.handong.csee.java.lab13.prob4;	//prob4. package name

//Dog class is created and also inherit Animal parent class.
public class Dog extends Animal implements Pet{
	
	public String food() {	//food method's return type is string.
		return "(Dog!)" + "Sausage";	//returns text
	}
}
