package com.assign;
//W.A.J.P to find factorial for Given Number.
import java.util.Scanner;

public class FactroailDemo {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=sc.nextInt();
	int i=1,fact=1;
	while(i<=num)
	{
		fact=fact*i;
		i++;
		
	}
	System.out.println("faCTROAIL NUMBER:"+fact);
		
	}
}
