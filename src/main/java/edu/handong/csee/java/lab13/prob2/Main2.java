package edu.handong.csee.java.lab13.prob2;	//prob2. package name

public class Main2 {	//Main2 is class name and modifier is public.

	public static void main(String[] args) {	//main method
		Book book = new Book("Simple Book");	//Book is a class name we want to create as an instance. new Book() is calling a constructor
		Science science = new Science("Hello Physics!", "ScienceWorld");	//Science is a class name we want to create as an instance. new Science(bookName, publisher) is calling a constructor
		History history = new History("What Is history?", "E.H.Carr");	//History is a class name we want to create as an instance. new History(bookName, author) is calling a constructor

		book.show();	//shows result of book
		science.show();	//shows result of science
		history.show();	//shows result of history

	}

}
