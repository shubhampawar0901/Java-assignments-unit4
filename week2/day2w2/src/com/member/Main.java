package com.member;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		System.out.println("Enter Employee Details :");
		System.out.println("Enter Name :");
		String name = scan.next();
		e1.setName(name);
		
		System.out.println("Enter Age:");
		int age = scan.nextInt();
		e1.setAge(age);
		
		System.out.println("Enter Phone:");
		String phone = scan.next();
		e1.setPhone(phone);
		
		System.out.println("Enter Salary:");
		int salary = scan.nextInt();
		e1.setSalary(salary);
		
		System.out.println("Enter Address:");
		String address = scan.next();
		e1.setAddress(address);
		
		System.out.println("================");
		System.out.println("Employee detials :");
		
		System.out.println("Name"+e1.getName());
		
		System.out.println("Age :"+e1.getAge());
		
		System.out.println("Phone:"+e1.getPhone());
		
		System.out.println("Salary:"+e1.getSalary());
		
		System.out.println("Address:"+e1.getAddress());
		
		Manager m1 = new Manager();
		
		System.out.println("================");
		System.out.println("Enter Manager Details :");
		System.out.println("Enter Name:");
		String name1 = scan.next();
		m1.setName(name1);
		
		System.out.println("Enter Age:");
		int age1 = scan.nextInt();
		m1.setAge(age1);
		
		System.out.println("Enter Phone:");
		String phone1 = scan.next();
		m1.setPhone(phone1);
		
		System.out.println("Enter Salary:");
		int salary1 = scan.nextInt();
		m1.setSalary(salary1);
		
		System.out.println("Enter Address:");
		String address1 = scan.next();
		m1.setAddress(address1);

		
		System.out.println("================");
		System.out.println("Manager detials :");
		System.out.println("Name"+m1.getName());
		System.out.println("Age :"+m1.getAge());
		System.out.println("Phone:"+m1.getPhone());
		System.out.println("Salary:"+m1.getSalary());
		System.out.println("Address:"+m1.getAddress());
	
		scan.close();
	}

}
