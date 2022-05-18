package com.masai;

public class PrimeFactors {
	public static void main(String[] args) {
		int num = 12;
		
		if(num<2 || num>100) {
			System.out.println("Invalid Number");
		}
		else {
			for(int i=2; i<num/2;i++) {
				if(num%i==0) {
					boolean flag = false;
					for(int j=2; j<i;j++) {
						if(i%j==0) {
							 flag = true;
							 break;
						}
					}
					if(flag == false) {
						System.out.println(i);
					}
				}
			}		
		}
	}
}
