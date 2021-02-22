package BitManipulation;

import java.util.Scanner;
//using left shift to find whether kth bit is set or not in a number 

public class CheckKthBit {
	
	public static void main(String args[ ]) {

		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Enter the bit number you wish to find");
		
		int k = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		 CheckKthBit.findKBit(num, k);
		
	}

	static void  findKBit(int n , int k) {
		int m = (1<<(k-1));
		
		if((n & m )!=0)
				System.out.print(" The kth bit is  Set" );
	else 
		System.out.print(" The kth bit is Not Set" );
	
	
}
}
