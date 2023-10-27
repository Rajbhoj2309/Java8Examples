package com.java8Features.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddEvenNumber {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42,14, 21, 67, 32,87, 95, 14, 56, 87);
		
		List<Integer>asEvenNumber=new ArrayList<Integer>();
		List<Integer>asOddNumber=new ArrayList<Integer>();
		
		listOfIntegers.forEach(number ->{
			if(number%2==0)
				asEvenNumber.add(number);
			else
				asOddNumber.add(number);
		});
		System.out.println("As Even Number : "+asEvenNumber.toString());
		System.out.println("As Odd Number : "+asOddNumber.toString());
		long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        // Convert execution time to milliseconds for easier reading
        double executionTimeMs = (double) executionTime / 1_000_000.0;

        System.out.println("Execution Time: " + executionTimeMs + " ms");
		
		//Another way
        
        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.groupingBy(i -> i%2==0));
        
        Set<Entry<Boolean,List<Integer>>> entrySet = collect.entrySet();
        for (Entry<Boolean, List<Integer>> entry : entrySet) {
        	System.out.println("=================");
			if (entry.getKey()) 
				System.out.println("Even Numbers : ");
			else 
				System.out.println("Odd Numbers : ");
			
			
			List<Integer> value = entry.getValue();
			for(int i: value)
				System.out.println(i);
		}
        
        // remove duplicate elements 
        List<Integer> removeDuplicate = listOfIntegers.stream().distinct().collect(Collectors.toList());
        System.out.println(removeDuplicate);
        
//        counting a character a given string
        
        String str="counting as a character given string";
        String replaceAll = str.replaceAll("\\s","" );
        char[] charArray = replaceAll.toCharArray();
		Map<Character, Integer> check=new HashMap<Character, Integer>();
		 for(char c:charArray) {
			 if (check.containsKey(c)) {
				check.put(c, check.get(c)+1);
			}else {
				check.put(c, 1);
			}
		 }
		 
		 System.out.println("given string is :\n"+str +"\n "+check);
		
		
	}

}
