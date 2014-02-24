package com.example.java8.lambda._04.methodref;

import java.util.function.Consumer;

public class LambdaMethodRefExample1 {
	
	public static void doSomething(Integer i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		Consumer<Integer> consumer1 = x-> doSomething(x);
		consumer1.accept(1);
		
		Consumer<Integer> consumer2 = LambdaMethodRefExample1::doSomething;
		consumer2.accept(1);
	}

}
