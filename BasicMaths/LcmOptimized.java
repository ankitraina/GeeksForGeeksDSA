package BasicMaths;

import java.util.Scanner;

public class LcmOptimized {
	public static void main(String args[ ]) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter num1");
			int num1 = sc.nextInt();
			System.out.print("Enter num2");
			int num2 = sc.nextInt();
			int gcd = LcmNaiveSoln.findLcm(num1, num2);
			System.out.print(gcd);
		}

}
	static int findGcd(int n1, int n2) {
		if(n2==0)
			return n1;
		return findGcd(n2, n1 % n2 );
		
	}
	
	
	static int findLcm(int n1 , int n2) {
		return (n1*n2)/findGcd(n1 , n2);

	
}
}