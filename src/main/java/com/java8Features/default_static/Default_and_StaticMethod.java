package com.java8Features.default_static;

public class Default_and_StaticMethod implements Functional_Interface1, Functional_Interface2{

	@Override
	public void method1(String str) {
				System.out.println(" "+str);
		
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		if ("Functional_Interface1".equals(str) && !str.isEmpty()) {
			Functional_Interface1.super.log(str);
		}
		if (str.equals("Functional_Interface2") && !str.isEmpty()) {
			Functional_Interface2.super.log(str);
		}
		
	}
	public static void main(String[] args) {
		Default_and_StaticMethod das=new Default_and_StaticMethod();
		das.method1("sad");
		das.log("Functional_Interface1");
		das.log("Functional_Interface2");
		Functional_Interface1.print("Functional_Interface1");
		Functional_Interface2.print("Functional_Interface2");
		
		Functional_Interface1 abc=new Default_and_StaticMethod();
		abc.log("Functional_Interface1");
	}

}
