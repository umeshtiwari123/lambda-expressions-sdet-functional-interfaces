package com.sdet.predicates;

import java.util.function.Predicate;
//Predicate ---> one parameter returns boolean
//use only if you have conditional checks in your program
public class Demo1 {

	public static void main(String[] args) {
		
		//Ex - 1
		Predicate<Integer> p=i->i>10;
		
		System.out.println(p.test(20));//true
		System.out.println(p.test(5));//false
		System.out.println(p.test(10));//false
		
		System.out.println("===============================================");
		
		//Ex 2: check the length of the given string is greater than 4 or not
		Predicate<String> pr=s->(s.length()>4);
		
		System.out.println(pr.test("Anunta")); //true
		System.out.println(pr.test("abc"));//false
		System.out.println(pr.test("ab"));//false

		System.out.println("===============================================");
		//Ex 3: print array elements whose size is > 4 from array 
		String names[]= {"David","Scott","Smith","John","Mary"};
		
		for (String name : names) {
			
//			if(pr.test(name))
//			{
//				System.out.print(name+" : ");
//			}
			
			if(name.length()>4)
			{
				System.out.println(name);
			}
			
		}
		
	}

}
