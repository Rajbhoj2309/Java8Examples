package com.java8Features.forEachMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class A {
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);
		Consumer<Integer> action = System.out::println;
		numberList.stream()
		  .filter(n -> n%2  == 0)
		  .forEach( action );
		
		
	}

}
