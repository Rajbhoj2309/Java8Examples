package com.java8Features.lamdaExprssion;

import java.util.stream.IntStream;

@FunctionalInterface
interface LamdaFI{
	int hashCode();  
    String toString();  
    boolean equals(Object obj);  
    ///////////////////////
	void multiplication(int x, int y );
	/////////
	static boolean isPrime(int number) {		
		if(number < 2) { return false;}
		else {
		for(int i=2; i<number; i++){
			if(number % i == 0) 
				System.out.println(i);
		}
		return true;}
	}
	static boolean isPrimeA (int number) {		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						index -> number % index != 0);
	}
	
	//////////////////////
	
}
public class Lamda implements LamdaFI{
public static void main(String[] args) {
	Lamda ab=new  Lamda();
	ab.multiplication(10, 5);
	LamdaFI fi=(x,y) -> System.out.println(x*y);
	fi.multiplication(220, 1);
	Runnable r1 = () -> System.out.println("My Runnable");
	r1.run();
	LamdaFI.isPrime(10);
	LamdaFI.isPrimeA(20);
	///////////////
	LamdaFI d=new LamdaFI() {
		
		@Override
		public void multiplication(int x, int y) {
			System.out.println(x*y);
			
		}
	};
	d.multiplication(5, 20);
	
	LamdaFI way2=(x,y) -> {
		System.out.println(x+y);
	};
	way2.multiplication(10, 5);
}

@Override
public void multiplication(int x, int y) {
	System.out.println(x*y);
	
}
}
