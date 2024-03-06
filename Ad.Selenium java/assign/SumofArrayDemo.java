package com.assign;
//WAP to sum values of an array.
public class SumofArrayDemo {

	 public static void main(String[] args) {
		
		 	int [] arr =new int[] {1,2,3,4,5,8};
		 	int sum=0;
		 	 int length = arr.length;
		 	for(int i=0;i<length;i++)
		 	{
		 		sum= sum + arr[i];
		 		
		 	}
		 	System.out.println("sum of an array:"+sum);
	}
}
