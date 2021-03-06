package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = Main.getEmployeeDetails();
		int pf = Main.getPFPercentage();
		int id = e1.getEmployeeId();
		e1.calculateNetSalary(pf);
		
		String name = e1.getEmployeeName();
		double salary = e1.getSalary();
		double netSalary = e1.getNetSalary();
		
		
		System.out.println("==============Employee Detials========");
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Netsalary :"+netSalary);
		
	}
	
	public static Employee getEmployeeDetails() {
		
		//take input for employee details;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Employee ID :");
		int empID = scan.nextInt();
		System.out.println("Enter Employee Name:");
		String empName = scan.next();
		System.out.println("Enter Salary");
		int empSalary = scan.nextInt();
		
		Employee e1 = new Employee();
		e1.setEmployeeId(empID);
		e1.setEmployeeName(empName);
		e1.setSalary(empSalary);
		return e1;
	}

	public static int getPFPercentage() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter PF percentage :");
		int pfPercentage = scan.nextInt();
		scan.close();
		return pfPercentage;
	}
	
}


class Employee {
	
	int employeeId;
	String employeeName;
	double salary;
	double netSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public void calculateNetSalary(int pfpercentage) {
		this.netSalary = this.salary - (salary*pfpercentage)/100;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
//second method
//	public Employee(int employeeId, String employeeName, double salary, double netSalary) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.salary = salary;
//		this.netSalary = netSalary;
//	}




}
