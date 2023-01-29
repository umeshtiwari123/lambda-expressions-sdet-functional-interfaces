package com.sdet.demo;


@FunctionalInterface
interface Hotel
{
	void food();
}

class HotelImplementing implements Hotel
{

	@Override
	public void food() {
		
		System.out.println("Food from Implementing Class");
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		
		Hotel hotelInter=new HotelImplementing();
		hotelInter.food();
		
		
		Hotel hotel=new Hotel() {
			@Override
			public void food() {
				System.out.println("FoodOrder from Anonymous class");
			}
		};
		
		Hotel hotel1=()->System.out.println("FoodOrder from lambda expression");
		
		hotel.food();
		
		hotel1.food();
	}

}
