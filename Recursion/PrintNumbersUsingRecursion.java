package Recursion;

import java.util.Scanner;

public class PrintNumbersUsingRecursion {
	
	public static void main(String args[ ]) {
		
		
		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		PrintNumbersUsingRecursion.printNumbers(num);
		
	}
	
	static void printNumbers(int num){
		
		if(num ==0) {
			//System.out.println(0);
			return;
		}
		
		
		System.out.println(num);
		printNumbers(num-1);
		
	}

}
