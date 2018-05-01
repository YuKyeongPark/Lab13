package edu.handong.csee.java.lab13.prob2;	//prob2. package name

public class Science extends Book{	//Science class is created and also inherit Book parent class.

	private String publisher;	//declares an additional variable publisher for the Book class.
	
	//constructor is a initialize method which has same name with class and there is no return type. this constructor has two parameter
	public Science(String bookName, String publisher) {
		super(bookName);	//super: points parent.
		this.publisher = publisher;	//puts parameter value in to Science class' variable publisher
	}
	
	public String toString() {	//text content
		return super.toString() + "\n\tPublisher: " + publisher;	//toString which is a method of Book + information about science

	}
	
	public void show(){	//method to show result
		System.out.println("<<<Science>>>" + this.toString());	//prints text about science
	}
}
