package com.example.java8.lambda._05.deafultmethods;

public interface TestA extends Test {
	
	@Override
	default void doSomething() {
		System.out.println("TestA");
	}

}
