package com.java8Features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class ParallelSequence {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John"); 
        
		names.add("John");
		         
		names.add("David");
		         
		names.add("Brijesh");
		
//		names.stream().forEach(System.out::println);
//		System.out.println("*===========");
//		names.stream().forEach(a -> System.out.println(a));
//		System.out.println("*****************");
//		names.parallelStream().forEach(a -> System.out.println(a));
//		//stream().filter()
//		System.out.println("*===========");
//		names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
//		names.stream().filter((String name) -> !name.equals("Samontika")).forEach(System.out::println);
//		
//		System.out.println("remove duplicate");
//		names.stream().distinct().forEach(System.out::println);
//		
//		System.out.println("limited names show");
//		names.stream().limit(2).forEach(System.out::println);
		
//		System.out.println("skip first 2 element");
//		names.stream().skip(2).forEach(System.out::println);
		
//		System.out.println("sort element by natural");
//		names.stream().sorted().forEach(System.out::println);
		
//		System.out.println(" string sort based length sorting using by comparator");
//		names.stream().sorted(((o1, o2) -> o1.length()-o2.length())).forEach(System.out::println);
//		
//		int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 11}).reduce(0, (a, b) -> a+b);
//		System.out.println("sum of array: " + sum);
//		
//		OptionalInt reduce = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce((a, b) -> a+b);
//		System.out.println("reduce : "+reduce);
		
		Optional<String> reduce = names.stream().skip(2).reduce((a,b)-> a+b);
		System.out.println(reduce);
		
	}
 
}
