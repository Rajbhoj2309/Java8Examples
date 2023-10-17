package com.java8Features.default_static;

@FunctionalInterface
interface Default{
	void abc();
	
	default void bcd() {
		
	}
}
public class DefaultMethod implements Default {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bcd() {
		// TODO Auto-generated method stub
		Default.super.bcd();
	}

}
