package edu.handong.csee.java.lab13.prob5;	//prob5. package name

public class Prob5 {	//Prob5 is a class, which is blueprint of object
	
	public static boolean equal(int[][] m1, int[][] m2) {	 //method to compare the two arrays
		int count = 0; //declares variable for counting 
		//condition1: if row size is different 		
		if(m1.length != m2.length)	//if the row of a array and b array is diff
			return false;	//return false
	
		//condition2: the number of different values between the two arrays are greater than 3, then false
		for(int i = 0; i < m1.length; i++)	//a row
			for(int j = 0; j < m1[i].length; j++)	//a col
			{
				if(m1[i][j] != m2[i][j])	//if a and b have different value each other
					count++;	//count + 1
		
			}
		
		if(count <= 3)	//if the number of different value between two array is smaller than 3,
			return true;	//return true
		
		else	//if the number of different value between two array is grater than 3,
			return false;	//return false
		
	}
}
