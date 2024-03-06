package com.assign;
//WAP to iterate through all elements in an array list.
import java.util.ArrayList;

//import java.util.ArrayList;

public class MainNew {
	public static void main(String[] args) {
		
		ArrayList<String> lan =new ArrayList();
		lan.add("java");
		lan.add("javaScript");
		lan.add("python");
		System.out.println("ArrayList: "+ lan);
		
		 for(int i = 0; i < lan.size(); i++) {
		      System.out.print(lan.get(i));
		      System.out.print(", ");
		    }
		
		
	}

}
