package com.assign;
//WAP to create one thread by implementing Runnable interface in Class.
public class NewThread implements Runnable
{

	public void run() {
		System.out.println("thread has endnd");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		NewThread ex=new NewThread();
		Thread t1=new Thread(ex);
		t1.start();
		System.out.println("hello");
			
	}

	
	
}
