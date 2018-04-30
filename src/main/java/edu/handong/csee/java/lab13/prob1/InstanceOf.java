package edu.handong.csee.java.lab13.prob1;	//package name

public class InstanceOf {	//InstanceOf is class name and modifier is public
	
	//static means class method and whatFriend method has Friend type friend parameter 
	public static void whatFriend(Friend friend) {	

		//instanceof checks object type. If result is true, it can be cast into SchoolFriend type.
		if(friend instanceof SchoolFriend)	
			((SchoolFriend) friend).schoolFriend();	//casts the friend as SchoolFriend and call the SchoolFriend's method schoolFriend
		
		//instanceof checks object type. If result is true, it can be cast into ClassFriend type.
		else if(friend instanceof ClassFriend)
			((ClassFriend) friend).classFriend();	//casts the friend as ClassFriend and call the ClassFriend's method classFriend
	
		//If condition do not fulfill the above conditions
		else	
			friend.justFriend();	//calls justFriend method in Friend type friend parameter
	}
}
