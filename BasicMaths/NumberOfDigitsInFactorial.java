package BasicMaths;
//to count the number of digits in factorial of a number

import java.util.Scanner;

public class NumberOfDigitsInFactorial {
	public static void main(String args[ ]) {
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			int val = NumberOfDigitsInFactorial.findNumber(num);
			System.out.println(val);
		}


	}
	static int findNumber(int a) {
		int i ;
		double digits =0;
		for(i=2;i<=a; i++) {
			
			digits = digits + Math.log10(i);
			System.out.println(digits);
		}
		
		return (int )Math.floor(digits)+1;
  }
}

