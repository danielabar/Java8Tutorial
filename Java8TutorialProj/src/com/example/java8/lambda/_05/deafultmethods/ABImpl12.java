package com.example.java8.lambda._05.deafultmethods;

public class ABImpl12 implements InterfaceA, InterfaceB {

	@Override
	public void doSomething() {
		System.out.println("ABImpl2");
		InterfaceA.super.doSomething();
	}
	
	public static void main(String[] args) {
		new ABImpl12().doSomething();
	}
}
