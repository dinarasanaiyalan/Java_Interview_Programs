package com.dinatechy.challange;

// Multiple Inheritance can be achievable in Java by using Interface
public class Child implements ParentOne, ParentTwo{

	@Override
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition of "+a+" and "+b+" is : "+c);
	}

	@Override
	public void sub(int a, int b) {
		int c = a-b;
		System.out.println("Subtraction of "+a+" and "+b+" is : "+c);
	}
	
	public static void main(String[] args) {
		
		Child childObject = new Child();
		childObject.add(10, 20);
		childObject.sub(10, 20);
		
	}

}
