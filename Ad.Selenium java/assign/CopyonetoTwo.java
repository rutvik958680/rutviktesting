package com.assign;
//WAP to Copy one array into another
public class CopyonetoTwo {

	public static void main(String[] args) {
		
		int a[]= {1,5,6,7,8};
		int b[]= new int[a.length];
		b=a;
		b[0]++;
		System.out.println("a[]");
		for(int i=0;i<a.length;i++)
		
			System.out.print(a[i]+" ");
			
		 System.out.println("\n Contents of b[] "); 
		for(int i=0;i<b.length;i++)
		
			System.out.print(b[i]+" ");
//		   System.out.println("Contents of a[] "); 
//	        for (int i = 0; i < a.length; i++) 
//	            System.out.print(a[i] + " "); 
//	  
//	        System.out.println("\n\nContents of b[] "); 
//	        for (int i = 0; i < b.length; i++) 
//	            System.out.print(b[i] + " "); 
			
		
	}
	
}
