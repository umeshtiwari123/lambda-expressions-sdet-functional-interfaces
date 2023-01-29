package com.sdet.demo;

@FunctionalInterface
interface Cab
{
	public void bookCab();
}

//class Ola implements Cab
//{
//
//	@Override
//	public void bookCab() {
//		
//		System.out.println("Booked OLA Cab.......");
//	}
//	
//	
//}


public class Test {

	public static void main(String[] args) {
		
		Cab cab=()->System.out.println("Booked OLA Cab.......");
		cab.bookCab();
		
	}

}
