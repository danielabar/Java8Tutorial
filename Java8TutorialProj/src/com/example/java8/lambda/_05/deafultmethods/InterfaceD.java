package com.example.java8.lambda._05.deafultmethods;

public interface InterfaceD extends InterfaceA {

	@Override
	public default void doSomething() {
		System.out.println("D");
	}
}
