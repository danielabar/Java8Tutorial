package com.example.java8.lambda._05.deafultmethods;

public interface InterfaceB {

	default void doSomething() {
		System.out.println("B");
	}
}
