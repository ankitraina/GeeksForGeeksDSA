
//Naive Approach
package BasicMaths;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String args[ ]) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter num1");
			int num1 = sc.nextInt();
			System.out.print("Enter num2");
			int num2 = sc.nextInt();
			int gcd = GreatestCommonDivisor.findGCD(num1, num2);
			System.out.print(gcd);
		}

	}

	static int findGCD(int n1 , int n2) {
		int res =0;
		if( n1<=n2) {
			res = n1;
		}
		else{
			res = n2;
		}
		while(res!=0) {
			if(n1 % res ==0 && n2 %res ==0) {
				return  res;
			}
			else {
				res--;
			}
		}


		return 0;

	}

}
