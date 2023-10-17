package com.java8Features.forEachMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}
	
}
public class BasicForEach {
	public static void main(String[] args) {
		//creating sample Collection
		

		
		
		List<Integer> myList=new ArrayList();
		for(int i=0;i<10;i++) {
			myList.add(i);
		}
		// checking each iterator by adding a comments line
		myList.forEach(System.out::println );
		
		//traversing using Iterator this 1 st way
		Iterator<Integer> iterator = myList.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		
		//2nd way
		//traversing through forEach method of Iterable with anonymous class
		
		myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}
			
		});
		
		//3rd way
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
		//4th way
		
		Consumer<Integer> makeUpperCase = new Consumer<Integer>() {
		    @Override
		    public void accept(Integer t) {
		      //More statements if needed
		      System.out.println(t);
		    }
		};

		myList.forEach(makeUpperCase);
		
	}
	

}

