package com.q2;
import java.util.Scanner;
public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String company,String...strings){
	System.out.println("==========================");
		boolean flag = false;
		for(int j=0; j<strings.length;j++) {
			for(int i=0; i<outdatedModels.length;i++) {
				if(strings[j].equals(outdatedModels[i])) {
					System.out.println(company +" "+strings[j]+"_OUTDATED");
				flag = true;
				}
			}
		}
		if(flag==false) {
			System.out.println("All models are availabel");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter company name");
		String companyName = sc.next();
		
		System.out.println("Enter number of models");
		int length = sc.nextInt();
		String[] s = new String[length];
		
		for(int i=0; i<length;i++) {
			System.out.println("Enter name of model");
			s[i]= sc.next();
		}
		
		Mobile mob = new Mobile();
		
		mob.searchOutdatedModel(companyName,s);
		sc.close();
	}
}
