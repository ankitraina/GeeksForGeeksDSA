package Recursion;

import java.util.Scanner;

//peform the sum of first N natural numbers using recursion
public class SumUsingRecursion {
public static void main(String args[ ]) {
	int sum=0;
		
		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		int val = SumUsingRecursion.sumNumbers(num);
		System.out.println(val);
		
	}
	
	static int  sumNumbers(int n){
	
		
		
		if(n==0) {
			return 0;
		}
		
	
		int sum = n+  sumNumbers(n-1);
		 
	
		
	return sum;
	

}
}
