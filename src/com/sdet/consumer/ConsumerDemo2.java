package com.sdet.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	String gender;
	
	Employee(String ename,int salary,String gender)
	{
		this.ename=ename;
		this.salary=salary;
		this.gender=gender;
	}
}

public class ConsumerDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee("David",50000,"Male"));
		empList.add(new Employee("John",30000,"Male"));
		empList.add(new Employee("Mary",20000,"Female"));
		empList.add(new Employee("Scott",60000,"Male"));
		
		//Function
		Function<Employee, Integer> f=emp->(emp.salary*10)/100;  //task1
		
		//Predicate
		Predicate<Integer> p=b->b>=5000; //task2
		
		//Consumer
		Consumer<Employee> c=emp->{
						System.out.println(emp.ename);
						System.out.println(emp.salary);
						System.out.println(emp.gender);
		}; //task3
		
		
		for (Employee e : empList) {
			
			int bonus=f.apply(e); //calculate bonus
			
			if(p.test(bonus)) //invoked predicate
			{
				c.accept(e);  //invoked consumer
				System.out.println("Employee Bonus :"+bonus);
			}
			
		}
		
	
	
	}
}
