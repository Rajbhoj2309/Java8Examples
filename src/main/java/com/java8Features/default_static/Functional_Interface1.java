package com.java8Features.default_static;

@FunctionalInterface
public interface Functional_Interface1 {
// if we are using @FunctionalInterface then compile time error show
//		Functional_Interface2 is not a functional interface because 
// functional interface has only one abstract method
	void method1(String str);
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
	
	static void print(String str){
		System.out.println("Printing Functional_Interface1 "+str);
	}
}
