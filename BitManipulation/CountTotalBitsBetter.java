package BitManipulation;
//this is an O(logn) soln. to count total number of bits in the binary representation of numbers

import java.util.Scanner;

public class CountTotalBitsBetter {

	public static void main(String args[]) {

		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int val = CountTotalBitsBetter.totalCount(n);
			System.out.print(val);
		}
	}

	static int totalCount(int n) {
		if (n == 0) {
			return 0;
		}

		int x = closest2power(n);

		int bitstill2Power = x * (1 << (x - 1));
		int bitsfrompowerton = (n - (1 << x) + 1);

		int total = bitstill2Power + bitsfrompowerton + totalCount(bitsfrompowerton - 1);

		return total;

	}

	static int closest2power(int n) {
		int x = 0;

		while ((1 << x) <= n) {
			x++;

		}
		return x - 1;

	}
}
