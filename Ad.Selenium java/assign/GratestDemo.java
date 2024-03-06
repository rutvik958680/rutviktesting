package com.assign;
//W.A.J.P to Take three numbers from the user and print the greatest number.
import java.util.Scanner;

public class GratestDemo {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the 1st number");
		int num1= in.nextInt();
		System.out.println("enter the 2st number");
		int num2= in.nextInt();
		System.out.println("enter the 3st number");
		int num3= in.nextInt();
		
		if(num1>num3 && num1>num2)
		{

			System.out.println("The gratest :"+num1);
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("the gratest is ::"+num2);
		}
		else {
			
			System.out.println("the gratest is ::"+num3);
		}
		
		
	}
}
