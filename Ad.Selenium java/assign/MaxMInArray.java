package com.assign;
//WAP to find the maximum and minimum value of an array.
public class MaxMInArray {

	public static void main(String[] args)
	{
	int [] arr= {5,6,7,39,77,66};
	 int length = arr.length;
	 int max=arr[0];
	 int min=arr[0];
	  for(int i=1;i<length;i++)
	  {
		  if(arr[i]>max)
		  {
			  max=arr[i];
			  
		  }
		  if(arr[i]<min)
		  {
			  min=arr[i];
			  
		  }
	  }

      System.out.println("Maximum value: " +max);
      System.out.println("Minimum value: " +min);
		
		
		
	}
}
