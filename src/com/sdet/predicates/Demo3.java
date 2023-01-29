package com.sdet.predicates;

import java.util.function.Predicate;

//Joining Predicates - and, or, negate

//p1 -- checks number is even-> true and odd->false  
//p2 -- checks num > 50 or not

public class Demo3 {

	public static void main(String[] args) {
		
		int a[] = {5,15,20,25,30,35,40,45,50,55,60,65,58};
		
		Predicate<Integer> p1= i->i%2==0;
		Predicate<Integer> p2= i->i>50;
		//and
		System.out.println("Following are numbers which are even and greater than 50 :");		
		System.out.println("and operation");
		for(int n:a)
		{
			//if(p1.test(n) && p2.test(n))
			if(p1.and(p2).test(n))
			{
				System.out.print(n+",");
			}
		}
		System.out.println();
		System.out.println("or operation");
		for(int n:a)
		{
			if(p1.or(p2).test(n))
			{
				System.out.print(n+",");
			}
		}
	}
}