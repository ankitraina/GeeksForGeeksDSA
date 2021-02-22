package BasicMaths;

import java.util.Scanner;

public class FindingPalindrome {
	public static void main(String args[ ]) {
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();

			boolean b= FindingPalindrome.isAPalindrome(num);
			System.out.print(b);

		}
	}

	static boolean  isAPalindrome(int value) {
		int originalNum = value;
		int rev = 0;
		if((value/10)==0) {

			return true;
		}
		else {
			while(value!=0) {

				int digit = value %10;

				value = value /10;

				rev = rev*10 + digit; 
		
			}
			if(rev == originalNum) {
				return true;
			}else {

				return false;
			}
		}


	}
}
