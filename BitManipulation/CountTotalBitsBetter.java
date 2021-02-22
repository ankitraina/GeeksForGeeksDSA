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
	static int totalCount(int num) {
		
		num = num + 1;
		for(int i=0; i< num; i++ ) {
		
			
			
		}



		return 0;




	}


}
