package com.assign;
//W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
//has two subclasses each having a method with the same name
//'message' that prints "This is first subclass" and "This is second
//subclass" respectively
//import com.oops.Demo;

abstract class Parent {

	 void message() { }
}
	class Subclass1  extends Parent {
		 @Override
	     void message() {
//	    	 @Override
	        System.out.println("This is first subclass...");

	    }

	}
	class Subclass2 extends Parent {
		 @Override
	     void message() {

	        System.out.println("This is second subclass....");

	    }

	}
	


public class ParentDemo {

	public static void main(String[] args) {
			
//		 FirstSubClass obj = new FirstSubClass();
		Subclass1 s1 = new Subclass1();

		   Subclass2 s2 = new Subclass2();

		   s1.message();

		   s2.message();
		
	}
}

 