package EmployeeProject;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> emplist = new ArrayList<Employee>();
		
		Employee el=new Employee("kavi", 101,  5, 50000);
		Employee e2=new Employee("Nivi", 103,  7, 70000);
		Employee e3=new Employee("Anu",  102,  1, 30000);
		Employee e4=new Employee("Anbu", 104,  5, 50000);
		Employee e5=new Employee("Kiran",105,  3, 70000);
		Employee e6=new Employee("sam",  106,  1, 30000);
		
		
		emplist.add(el);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		
		
		System.out.println("Display the salary");
		emplist
		.stream()
		.map(emp -> emp.getSalary())
		.forEach(System.out::println);
		
		System.out.println("display the name whose salary is more than 4k");
		emplist
		.stream()
		.filter(emp -> emp.getSalary()>40000)
		.map(emp -> emp.getName())
		.forEach(System.out::println);
		
		System.out.println("display the empid who all are  the above 5years	");	
		emplist
		.stream()
		.filter(emp -> emp.getExp()>3)
		.map(emp -> emp.getEmpid())
		.forEach(System.out::println);
	}

}
