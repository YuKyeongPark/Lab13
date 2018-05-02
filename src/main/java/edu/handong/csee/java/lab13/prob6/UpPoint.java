package edu.handong.csee.java.lab13.prob6;	//prob6. package name

public class UpPoint implements CapitalPrint{	//UpPoint class is inherited CapitalPrint class.
	private int x, y;	//declares private type variable x, y

	UpPoint(int x, int y)	//constructor has no return type	
	{
		this.x = x; this.y = y;	//puts value of parameter into class variable 
	}
	
	public String toString() {	//method to return x and y
		return "x:" + x + " y:" + y;	//returns x and y
	}
}
