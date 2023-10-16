package com.java8Features.default_static;

public class Default_and_StaticMethod implements Functional_Interface1, Functional_Interface2{

	@Override
	public void method1(String str) {
				System.out.println(" "+str);
		
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Functional_Interface1.super.log(str);
		Functional_Interface2.super.log(str);
	}
	public static void main(String[] args) {
		Default_and_StaticMethod das=new Default_and_StaticMethod();
		das.method1("sad");
		das.log("bad");
		Functional_Interface1.print("fi1");
		Functional_Interface2.print("fi2");
	}

}
