package com.practise;

public class AnotherExample {

	public static void main(String args[]) {
		B a = new B();
	}
}

class A {
	public A() {
		System.out.println("INSIDE A");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("INSIDE B");
	}

	{
		System.out.println("INSIDE instance block of b");
	}
}