package edu.handong.csee.java.lab13.prob4;	//prob4. package name

public class Animal {	//Animal class which is blueprint of object
	
	private String name;	//declares private string type 'name' variable
	
	public void setName(String name) {	//setter
		this.name = name;	//puts value of parameter 'name' into class variable 
	}
	
	public void getName() {	//getter
		System.out.println("Name: " + name);	//prints name
	}
}
