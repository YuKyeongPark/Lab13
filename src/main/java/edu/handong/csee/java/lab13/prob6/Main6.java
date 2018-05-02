package edu.handong.csee.java.lab13.prob6;	//prob6. package name

public class Main6 {	//Main6 class has a main method

	public static void main(String[] args) {	//main method
		
		UpPoint l1 = new UpPoint(3,3);	//initiation to UpPoint, location is 3,3
		DownPoint l2 = new DownPoint(2,5);	//initiation to DownPoint, location is 2,5 
		DownPoint l3 = new DownPoint(4,7);	//initiation to DownPoint, location is 4,7
		UpPoint l4 = new UpPoint(9,12);	//initiation to UpPoint, location is 9,12
		
		Printer.print(l1);	//calls 'print' method of Printer
		Printer.print(l2);	//calls 'print' method of Printer
		Printer.print(l3);	//calls 'print' method of Printer
		Printer.print(l4);	//calls 'print' method of Printer

	}

}
