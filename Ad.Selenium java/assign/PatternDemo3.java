//   1 
//  2 2 
// 3 3 3 
//4 4 4 4 
package com.assign;

public class PatternDemo3 {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for( int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
