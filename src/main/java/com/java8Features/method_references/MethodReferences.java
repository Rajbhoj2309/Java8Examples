package com.java8Features.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferences {
	public static void main(String[] args) {
		Function<String, String> getPropertyFunction = System::getProperty;
		String javaHome = getPropertyFunction.apply("java.home");
		System.out.println("Java Home: " + javaHome);
		

		List<String> propertyNames = Arrays.asList("java.home", "java.version", "user.dir");
		propertyNames.stream().map(System::getProperty)
		    .forEach(System.out::println);
	}
	


}
