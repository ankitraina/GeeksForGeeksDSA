package BitManipulation;
//this is an O(logn) soln. to count total number of bits in the binary representation of numbers

import java.util.Scanner;

public class CountTotalBitsBetter {

	public static void main(String args[]) {

		System.out.println("Enter a number");
		try(Scanner sc = new Scanner(System.in) ){
			int n = sc.nextInt();
			int val = CountTotalBitsBetter.totalCount(n);
			System.out.print(val);
		}
	}

	static int totalCount(int n) {
		
		int powerOf2 = 2; 
		int cnt = n/2;
		while(powerOf2<=n) {
			int totalPairs = n /powerOf2;
			
			
		}
		
		return cnt;
		

	}
}



