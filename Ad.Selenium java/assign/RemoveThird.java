package com.assign;
//WAP to remove the third element from a array list.
import java.util.ArrayList;

public class RemoveThird {

public static void main(String[] args) {
		
		ArrayList<String> lan =new ArrayList();
		lan.add("red");
		lan.add("white");
		lan.add("Black");
		lan.add("pink");
		System.out.println("ArrayList: "+ lan);
		lan.remove(2);
		System.out.println("new arraylist:"+lan);
}
	
	
}
