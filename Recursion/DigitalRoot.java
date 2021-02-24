package Recursion;

import java.util.Scanner;

public class DigitalRoot {
	public static void main(String args[ ]) {


		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			int val = DigitalRoot.digitalRoot(num);
			System.out.println(val);

		}
	}



	public static int digitalRoot(int n)
	{
		// add your code here
		if(n==0){
			return 0;
		}
		int sum = n%10 + digitalRoot(n/10);


		if(sum>=10){
			sum = sum %10 + digitalRoot(sum/10);
		}

		return sum;
	}
}