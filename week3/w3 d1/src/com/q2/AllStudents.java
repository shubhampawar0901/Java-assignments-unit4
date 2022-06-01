package com.q2;
import java.util.Scanner;
public class AllStudents {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Enter History Student Details=====");
		
		System.out.println("Enter history student name :");
		String hsName = sc.next();
		
		System.out.println("Enter history student address :");
		String hsAddress = sc.next();
		
		HistoryStudent hstud1 = new HistoryStudent(hsName, hsAddress);
		
		System.out.println("Enter civics marks");
		hstud1.civicsMarks = sc.nextInt();
		
		System.out.println("Enter history marks");
		hstud1.historyMarks = sc.nextInt();
		
		System.out.println("Enter Science student name :");
		String sciName = sc.next();
		System.out.println("Enter Science student address :");
		String sciAddress = sc.next();
		
		ScienceStudent sciStud1 = new ScienceStudent(sciName, sciAddress);
		
		System.out.println("Enter Science Student Marks");
		System.out.println("Chemistry:");
		sciStud1.chemistryMarks = sc.nextInt();
		System.out.println("Maths");
		sciStud1.mathsMarks = sc.nextInt();
		System.out.println("Physics");
		sciStud1.phisicsMarks = sc.nextInt();
		
		System.out.println("====Percentages of Science Student and History Student=====");
		
		System.out.println("Science Student :"+ sciStud1.getPercentage()+"%");
		System.out.println("History Student :"+ hstud1.getPercentage()+"%");
		
		sc.close();
	}

}
