package com.java8Features.forEachMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListTraverseByConsumer {
	public static void main(String[] args) {
		Consumer<String> makeUpperCase = new Consumer<String>() {
		    @Override
		    public void accept(String t) {
		      //More statements if needed
		      System.out.println(t.toUpperCase());
		    }
		};

		List<String> list = Arrays.asList("Alex", "Brian", "Charles");
		list.forEach(makeUpperCase);
	}

}
