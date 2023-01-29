package com.sdet.Function_interface;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=n->n*n;
		
		System.out.println(f.apply(5));//25
		System.out.println(f.apply(10));//100
		System.out.println(f.apply(2));//4
		
		//String length
		
		//String --->length ---Int
		
		Function<String,Integer> fn=s->s.length();
		
		System.out.println(fn.apply("Welcome"));  //7
		System.out.println(fn.apply("Java Programming"));  //16
		
		
		
		
		
		
	}

}
