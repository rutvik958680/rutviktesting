package com.assign;
//W.A.J.P to check given number is Prime or not?
import java.util.Scanner;

public class PrimeDemo {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");

	int no=sc.nextInt();
	int a=0;
//	boolean isprime=true;
	for(int i=2;i<no;i++)
	{
		if(no%i==0) {
		a=1;
		break;
	}
	}

			if(a==0)
			{
					System.out.println("no is prime...."+no);;	
			}
	
			else {
				System.out.println("no is not prime"+no);
			}
}
}