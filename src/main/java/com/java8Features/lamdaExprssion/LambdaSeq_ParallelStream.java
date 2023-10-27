package com.java8Features.lamdaExprssion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

@FunctionalInterface
interface TestSeqParallel{
	abstract void data();
	public static boolean isPrime(int number) {		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						index -> number % index == 0);
	}
	
	public static boolean isPrime1(int number) {
		IntPredicate isDivisible = index -> number % index == 0;
		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						isDivisible);
	}
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
	    return numbers.parallelStream()
	    		.filter(predicate)
	    		.mapToInt(i -> i)
	    		.sum();
	}
	
	
}
public class LambdaSeq_ParallelStream implements TestSeqParallel{
	
	@Override
	public void data() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		int a=11;
		int b=12;
		boolean prime = TestSeqParallel.isPrime(a);
		System.out.println(a +" is prime number "+prime);
		boolean prime1 = TestSeqParallel.isPrime1(b);
		System.out.println(b +" is prime number "+prime1);
		
		List<Integer> myList=new ArrayList<Integer>();
		for (int i = 0; i <=10; i++) {
			myList.add(i);
		}
		int sum = myList.stream().filter(w -> w!= 5).mapToInt(w -> w).sum();
		System.out.println(sum);
		
		IntStream.of(1, 2, 3, 4).filter(e -> e > 2).peek(e -> System.out.println("Filtered value: " + e))
		.map(e -> e * e).peek(e -> System.out.println("Mapped value: " + e)).sum();
		
		int sumWithCondition = TestSeqParallel.sumWithCondition(myList, m-> true);
		System.out.println(sumWithCondition);
		int sumWithCondition1 = TestSeqParallel.sumWithCondition(myList, m-> m%2==1 && m<30);
		System.out.println("sumWithCondition1 : "+sumWithCondition1);
		
		int sumWithCondition2 = TestSeqParallel.sumWithCondition(myList, m-> 23>m);
		System.out.println("sumWithCondition2: "+sumWithCondition2);
	}
}
