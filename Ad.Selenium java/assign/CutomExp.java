package com.assign;
//W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance.
//Account balance is:2000 Enter withdraw amount:2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
import java.util.Scanner;

//import com.exe.ATM;
//import com.exe.RahulException;

 class CutomException extends Exception
{
	
		double amount;
		public CutomException(double amount)
		{
			this.amount=amount;
			
		}
	}
	class Bank
	{
		double balance;
		public void deposit(double amount)
		{
			balance=balance+amount;
//			System.out.println(amount+"rs depostited...");
			
		}
		public void withdrawa(double amount) throws CutomException
		{
			if(amount<=balance)
			{
				balance=balance-amount;
				System.out.println(amount+"rs withdrawal success..");
				
			}
			else {
				double needs=amount - balance;
				throw new CutomException(needs);
			}
		}
	}

	public class CutomExp {
	public static void main(String[] args) {
		Bank a1=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount for Deposit..");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		System.out.println("eneter amount for withdrawal..");
		amount=sc.nextDouble();
		 try
		 {
			 a1.withdrawa(amount);
		 }catch(CutomException e)
		 {
			 System.out.println("If the enter"+e.amount+"rs more into your account than withdrwal"+amount+" rs..");
		 }
		
	}
		
	
	

}
