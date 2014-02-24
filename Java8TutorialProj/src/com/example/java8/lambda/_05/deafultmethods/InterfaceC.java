package com.example.java8.lambda._05.deafultmethods;

public interface InterfaceC extends InterfaceA {

	default void other() {
		System.out.println("C");
	}
}
