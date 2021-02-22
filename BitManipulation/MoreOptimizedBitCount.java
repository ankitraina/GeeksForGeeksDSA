package BitManipulation;
//this works in O(1) for a 32 bit representation of integers

import java.util.Scanner;

public class MoreOptimizedBitCount {
	public static void main(String args[ ]) {

		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		int val = MoreOptimizedBitCount.findCount(num);
		System.out.println(val);
	}

	static int findCount(int n ) {
		int table[ ] = new int[256];
		table[0]= 0;
		for(int i=1; i<256;i++) 
			table[i]= (i & 1) + table[i / 2];
		
		int res= table[n & 0xff];
		n = n>>8;
		res = res  + table[n & 0xff];
		n = n>>8;
		res = res + table[n & 0xff];
		n = n>>8;
		res = res + table[n & 0xff];
		n= n>>8;
		return res;
	}
}
