package com.assign;

import java.util.Scanner;

public class GradeMassage {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks :..");
	int a=sc.nextInt();
	if (a>91 && a<=100) {
		System.out.println("AA...."+a);
	}
	if (a>81 && a<90) {
		System.out.println("AB...."+a);
	}
	if (a>71 && a<80) {
		System.out.println("BB...."+a);
	}
	if (a>61 && a<70) {
		System.out.println("BC...."+a);
	}
	if (a>51 && a<60) {
		System.out.println("CD...."+a);
	}
	if (a>41 && a<50) {
		System.out.println("DD...."+a);
	}
	if (a<=40) {
		System.out.println("Fail...."+a);
	}
	else if(a>100)
	{
		System.out.println("NOT Allowed...."+a);
	}
//	101
	
	
}

}
