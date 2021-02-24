package Recursion;

import java.util.Scanner;

public class RecursivePower {
	public static void main(String args[ ]) {


		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			System.out.print("Enter Power of number ");
			int num2= sc.nextInt();
			int val = RecursivePower.recursivePower(num1,num2);
			System.out.println(val);

		}
	}




	static int recursivePower(int n,int p)
	{
		// add your code here
		if(p==0)
			return 1;
		n= n * recursivePower(n,p-1);
		return n;
	}
}