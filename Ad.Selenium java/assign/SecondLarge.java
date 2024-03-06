package com.assign;
//WAP to find the second largest element in an array.
import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		
		int a[]= {4,67,77,5,4,78,123};
		int size=a.length;
//		Arrays.sort(a);
//		System.out.println("sorted array:"+Arrays.toString(a));
		int res=a[size-2];
		System.out.println("2nd lasrgest array is::"+res);
	}
}
