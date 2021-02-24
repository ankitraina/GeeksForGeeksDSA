package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String args[ ]) {


		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			System.out.print("Enter Reverse of the number ");
			int num2 = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			long val = PowerOfNumber.power(num1, num2);
			System.out.println(val);

		}
	}


	static long power(int N,int R)
	{
		//Your code here
		if(R==0){
			return 1;
		}
		long pow = ((N * ( power(N,R-1)))% (1000000007));
		return pow;

	}
}