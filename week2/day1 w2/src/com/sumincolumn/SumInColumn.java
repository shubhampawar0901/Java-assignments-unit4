package com.sumincolumn;

import java.util.Scanner;

public class SumInColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int[][] i = new int[3][3];
//		
//		for(int row=0; row<3; row++) {
//			for(int col=0; col<3; col++) {
//				i[row][col] = sc.nextInt();
//			}
//		}
		
		
		int arr1[][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					  };
		
		for(int row=0; row<arr1.length;row++) {
			int sum  =0;
			for(int col =0; col<arr1[row].length;col++) {
				if(arr1[col][row]%2==0) {
					sum += arr1[col][row];
				}
			}
			System.out.println(sum);
		}
		
		sc.close();

	}

}
