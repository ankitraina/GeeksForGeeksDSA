package BitManipulation;

import java.util.Scanner;
//time = O(no.of 1's in binary represen of number)




public class BrianKerningnCountBitAlgo {
	public static void main(String args[ ]) {
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();

			int fact = BrianKerningnCountBitAlgo.countBits(num);
			System.out.print(fact);
		}
	}
	static int countBits(int n) {
		
		int res= 0;
		while(n>0) {
			n= (n & (n-1));
			res++;
		}
		return res;

	}
}
