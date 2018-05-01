package edu.handong.csee.java.lab13.prob2;	//prob2. package name

public class Book {	//Book class and modifier is public
	//this variable can be used all instance.
	private static int idCount = 0;	//declares and initiates private int type variable idCount

	private String bookName;	//declares private String type variable bookName
	private int id;	//declares private int type variable id
	
	//constructor is a initialize method which has same name with class and there is no return type 
	public Book(String bookName) {
		this.bookName = bookName;	
		idCount++;	//idCount+1
		id = idCount;	//puts value of idCount into id
	}
	
	public String toString() {	//text content
		return "\n\tId: " + id + "\n\tBook Name: " + bookName;
	}
	
	public void show(){	//method to show result
		System.out.println("<<<BOOK>>>" + this.toString());	//prints text about book
	}
}
