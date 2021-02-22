package BasicMaths;

import java.util.Scanner;

public class OptimizedEuclideanGCD {
	
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
		
		if(n2 ==0) {
			return n1;
		}else
			return findGCD(n2, n1 %n2);
	}
	

}
