package BasicMaths;

import java.util.Scanner;

public class LcmNaiveSoln {

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
	static int findLcm(int n1 , int n2) {
		int res = Math.max(n1,n2);
		while(true) {
			if(res % n1 ==0 && res % n2 ==0) 
				return res;
			res++;
		}
	}
}
