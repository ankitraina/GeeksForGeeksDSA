package BitManipulation;

import java.util.Scanner;

public class PowerTwo {

	public static void main(String args[ ]) {

		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		boolean  val = PowerTwo.findIfPowerTwo(num);
		System.out.println(val);
	}

	static boolean findIfPowerTwo(int n ) {


		double num =(Math.log10 (n)) / (Math.log10(2));
		if(num == Math.floor(num)) {
			return true;
		}
		return false;

	}
}