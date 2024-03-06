package com.assign;
//WAP to calculate the average value of array elements.
public class AvarageofArrayDemo {

	
	 public static void main(String[] args) {
			
		 	int [] arr =new int[] {1,2,3,4,5,89,77};
		 	int sum=0;
		 	 int length = arr.length;
		 	for(int i=0;i<length;i++)
		 	{
		 		sum= sum + arr[i];
		 		
		 	}
//		 	System.out.println("sum of an array:"+sum);
	double average=sum/ length;
	System.out.println("ava:..."+average);
	 }
	
}
