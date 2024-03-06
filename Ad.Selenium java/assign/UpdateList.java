package com.assign;
//WAP to update specific array element by given element.
import java.util.ArrayList;

public class UpdateList {
public static void main(String[] args) {
		
		ArrayList<String> lan =new ArrayList();
		lan.add("red");
		lan.add("white");
		lan.add("Black");
		lan.add("pink");
		System.out.println("ArrayList: "+ lan);
		lan.set(0, "clay");
		lan.set(2, "cyan");
		System.out.println("UpdatedArrayList: "+ lan);
}
}
