package com.primenumber;

public class Main{
	
	public int findCountOfPrime(int[] inputArray) {
		int count =0;
		for(int i=0; i<inputArray.length;i++) {
			int num = inputArray[i];
			boolean flag = false;
			for(int j=2; j<Math.sqrt(num);j++) {
				if(num%j==0) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				count++;
			}
		}
		return count;
	}
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		int[] ar = new int[findCountOfPrime(inputArray)];

		int index =0;
		for(int i=0; i<inputArray.length;i++) {
			int num = inputArray[i];
			boolean flag = false;
			for(int j=2; j<Math.sqrt(num);j++) {
				if(num%j==0) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				ar[index++]=inputArray[i];
			}
		}
		
		return ar;
		
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
	}
	public static void main(String[] args){
		
		
		//Create the object of Main class
		Main main = new Main();
		
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,15};
		int[] arrOut = main.findAndReturnPrimeNumbers(arr);

		//print each element from the returned array of findAndReturnPrimeNumbers method
		if(arrOut.length!=0) {
			System.out.println("Prime numbers from array are :");
			for(int i=0; i<arrOut.length;i++) {
				System.out.println(arrOut[i]);
			}
		}
		//if findAndReturnPrimeNumbers method returns an empty array then print the following message:
		else {
			System.out.println("Prime number not found in the supplied Array");
		}
	}
}
