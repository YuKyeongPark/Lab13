package edu.handong.csee.java.lab13.prob1;	//package name

public class Main1 {	//Main1 is class name and modifier is public.

	public static void main(String[] args) {	//main method
		
		Friend friend1 = new Friend();	//Friend is a class name we want to create as an instance. new Friend() is calling a constructor
		SchoolFriend friend2= new SchoolFriend();	//SchoolFriend is a class name we want to create as an instance. new SchoolFriend() is calling a constructor
		ClassFriend friend3 = new ClassFriend();	//ClassFriend is a class name we want to create as an instance. new ClassFriend() is calling a constructor
		
		InstanceOf.whatFriend(friend1);	//calls whatFriend which has friend1(Friend type) parameter in InstanceOf class 
		InstanceOf.whatFriend(friend2);	//calls whatFriend which has friend2(SchoolFriend type) parameter in InstanceOf class
		InstanceOf.whatFriend(friend3);	//calls whatFriend which has friend3(ClassFriend type) parameter in InstanceOf class
		
		
	}

}
