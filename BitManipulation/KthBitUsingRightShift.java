package BitManipulation;

import java.util.Scanner;

public class KthBitUsingRightShift {
	//using Right shift to find whether kth bit is set or not in a number 
		
		public static void main(String args[ ]) {

			System.out.print("Enter a number ");
			try (Scanner sc = new Scanner(System.in)) {
				int num = sc.nextInt();
				System.out.print("Enter the bit number you wish to find");
				
				int k = sc.nextInt();
				//countNumberOfDigits count = new countNumberOfDigits();
				KthBitUsingRightShift.findKBit(num, k);
			}
			
		}

		static void  findKBit(int n , int k) {
		int m = (n>>(k-1));
		if((m & 1 )!=0) 
			System.out.print(" The kth bit is  Set" );
else 
	System.out.print(" The kth bit is Not Set" );
			
		}
}
