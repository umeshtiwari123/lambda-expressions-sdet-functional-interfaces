package com.sdet.predicates;
import java.util.ArrayList;
import java.util.function.Predicate;
class Employee
{
	String ename;
	int salary;
	int experience;
	Employee(String ename, int salary, int experience) {
		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}
//	@Override
//	public String toString()
//	{
//		return "["+" name : "+ename+" , salary : "+salary+" , experience : "+experience +"]";
//	} 
}
public class Demo2 {
	public static void main(String[] args) {
		//Ex-1
		Employee emp=new Employee("John",50000,5);
		Employee emp1=new Employee("John",25000,5);

		//emp obj -->return name if sal> 30k and exp>3 years
		
		Predicate<Employee> pr = e->(e.salary>30000 && e.experience>3); 
		
		System.out.println(pr.test(emp));//true
		System.out.println(pr.test(emp1));//false
		
		//Ex-2
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("John",50000,5));
		al.add(new Employee("David",20000,2));
		al.add(new Employee("Scott",30000,3));
		al.add(new Employee("Mary",40000,6));
		for(Employee e:al)
		{
			if(pr.test(e))
			//if(e.salary>30000 && e.experience>3)	
			{
				System.out.println(e.ename+"     "+e.salary);
	//			System.out.println(e);
			}
		}
	}
}
