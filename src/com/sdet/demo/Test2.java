package com.sdet.demo;


@FunctionalInterface
interface Cab1
{
	public String bookCab(String source,String destination);
}

//class Ola1 implements Cab1
//{
//	@Override
//	public String bookCab(String source,String destination)
//	{
//		System.out.println("Ola cab is booked from "+source +" to "+destination);
//		return ("Price is 500 Rs");
//	}
//}

public class Test2 {

	
	public static void main(String[] args) {
			
		//Cab1 cab1=new Ola1();
		//System.out.println(cab1.bookCab("Hyd", "Mumbai"));
		
		Cab1 cab2=(source,destination) ->
		{
			System.out.println("Ola cab is booked from "+source +" to "+destination);
			return "price is 495";
		};
		
		System.out.println(cab2.bookCab("Delhi", "Jaipur"));
		
		 
	}
}
