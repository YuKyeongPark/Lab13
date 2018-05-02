package edu.handong.csee.java.lab13.prob4;	//prob4. package name
import java.util.Scanner;	//import Scanner which exists java


public class Main4 {	//Main class

	public static void main(String[] args) {	//main method
		String catName, dogName;	//declares variables
		Master master = new Master();	//instantiation:creating object master and type is Master
		Cat cat = new Cat();	//instantiation:creating object cat and type is Cat
		Dog dog = new Dog();	//instantiation:creating object dog and type is Dog
		
		System.out.println("Enter the cat name and dog name: ");	//prints text
		Scanner myKeyboard = new Scanner(System.in);	//Scanner instantiation
		catName= myKeyboard.next();	//user can input to catName by using myKeyboard
		dogName= myKeyboard.next();	//user can input to dogName by using myKeyboard
		
		cat.setName(catName);	//gets catName which user inputs and substitutes catName
		cat.getName();	//calls method of Animal class which is parent class of Cat class
		master.feed(cat);	//calls method of Master class
		
		dog.setName(dogName);	//gets dogName which user inputs and substitutes dogName
		dog.getName();	//calls method of Animal class which is parent class of Dog class
		master.feed(dog);	//calls method of Master class
		
		}
	

}
