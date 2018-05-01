package edu.handong.csee.java.lab13.prob2;	//prob2. package name

public class History extends Book{	//History class is created and also inherit Book parent class.
	
	private String author;	//declares an additional variable publisher for the Book class.
	
	//constructor is a initialize method which has same name with class and there is no return type. this constructor has two parameter
	public History(String bookName, String author) {
		super(bookName);	//super: points parent
		this.author = author;	//puts parameter value in to History class' variable author
	}
	
	public String toString() {	//text content
		return super.toString() + "\n\tAuthor: " + author;	//toString which is a method of Book + information about history
	}
	
	public void show(){	//method to show result
		System.out.println("<<<History>>>" + this.toString());	//prints text about history
	}
}
