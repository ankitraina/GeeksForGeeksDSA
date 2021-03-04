package BitManipulation;

import java.util.Scanner;

public class BitSetCountNaive {
	public static void main(String args[]) {
		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// countNumberOfDigits count = new countNumberOfDigits();
		int val = BitSetCountNaive.findNumber(num);
		System.out.println(val);
	}

	static int findNumber(int a) {
		int res = 0;
		while (a > 0) {
			if ((a & 1) == 1) {
				res++;
			}
			a = a >> 1;
		}

		return res;

	}

}
