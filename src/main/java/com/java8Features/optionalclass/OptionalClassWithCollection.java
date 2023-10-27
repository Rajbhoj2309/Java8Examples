package com.java8Features.optionalclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class OptionalClassWithCollection {
	public static void main(String[] args) {
		List<String> aslist=new ArrayList<String>();
		aslist.add("asdsa");
		aslist.add(null);
		aslist.add("");
		
		
		Optional<List<String>> of = Optional.of(aslist);
		
		if (of.isPresent()) {
			for (String str : aslist) {
				System.out.println(str);
			}
		}else {
			System.out.println("It is empty".toUpperCase());
		}
		List<Integer>asInt=new ArrayList<Integer>();
		System.out.println(asInt);
		Optional<List<Integer>> of2 = Optional.of(asInt);
		
		System.out.println(of2);
	}

}
