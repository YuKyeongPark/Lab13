package edu.handong.csee.java.lab13.prob5;	//prob5. package name
import java.util.Scanner;	//import Scanner which exists java

public class Main5 {	//Main5 Class has main method
	
	public static void main(String[] args) {	//main method
		int row=0, col=0;	//declares and initiates variables
		Scanner myKeyboard = new Scanner(System.in);	//Scanner instantiation
		
		System.out.print("Enter row size(maximum 5): ");	//prints text
		row = myKeyboard.nextInt();	//user can input to row by using myKeyboard
		System.out.print("Enter column size(maximum 5): ");	//prints text
		col = myKeyboard.nextInt();	//user can input to col by using myKeyboard
		int[][] m1 = new int[row][col];	//instantiation:creating object m1 and type is 2d int array.

		System.out.print("Enter row size(maximum 5): ");	//prints text
		row = myKeyboard.nextInt();	//user can input to row by using myKeyboard
		System.out.print("Enter column size(maximum 5): ");	//prints text
		col = myKeyboard.nextInt();	//user can input to col by using myKeyboard
		int[][] m2 = new int[row][col];	//instantiation:creating object m2 and type is 2d int array.

		System.out.print("Enter list1: ");	//prints text about list1
		
		//gets list from user
		for(int i = 0; i < m1.length; i++)	//list1 row, number of line
			for(int j = 0 ; j < m1[i].length; j++)	//list2 col
			{
				m1[i][j] = myKeyboard.nextInt();	//gets list1 from user
			}
		System.out.print("Enter list2: ");	//prints text about list2
		for(int i = 0; i < m2.length; i++)	//list2 row, number of line
			for(int j = 0 ; j < m2[i].length; j++)	//list2 col
			{
				m2[i][j] = myKeyboard.nextInt();	//gets list2 from user
			}
		
		//prints list1
		for(int i = 0; i < m1.length; i++)	//list1 row, number of line
		{
			for(int j = 0 ; j < m1[i].length; j++)	//list1 col
				System.out.print(m1[i][j] + " ");	//prints list1 
			System.out.println();	//next row
		}
		System.out.println();	//enter
	
		//prints list2
		for(int i = 0; i < m2.length; i++)	//list2 row, number of line
		{
			for(int j = 0 ; j < m2[i].length; j++)	//list2 col
				System.out.print(m2[i][j] + " ");	//prints list2
			System.out.println();	//next row
		}
		System.out.println();	//enter

		Prob5 prob5 = new Prob5();	//initiation to use method of prob5
		//compare
		if(Prob5.equal(m1,m2))	//if m1 and m2 is equal
			System.out.println("The two arrays are approximately identical.");	//prints this
		else	//if m1 and m2 is diff
			System.out.println("The two arrays are not identical");	//prints this
		
	}

	

}

