package com.example.java8.lambda._04.methodref;

import java.util.function.Consumer;


public class LambdaMethodRefExample2 {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer1 = x -> System.out.println(x);
		consumer1.accept(1);
		
		Consumer<Integer> consumer2 = System.out::println;
		consumer2.accept(1);
		
	}

}
