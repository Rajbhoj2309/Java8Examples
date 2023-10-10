package com.java8Features.default_static;

@FunctionalInterface
public interface Functional_Interface2 {
// if we are using @FunctionalInterface then compile time error show
//	Functional_Interface2 is not a functional interface because 
// functional interface has only one abstract method
	void method1(String str);
}
