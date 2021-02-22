package BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String args[ ]) {

		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		boolean  val = PowerTwo.findIfPowerTwo(num);
		System.out.println(val);
	}

	static boolean findIfPowerTwo(int n ) {
		return (n!=0) &&( (n &(n-1))==0);
			
		
	}
}
