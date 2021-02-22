package BasicMaths;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[ ]) {
		System.out.print("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
		
		boolean res= PrimeNumber.findPrime(num);
		System.out.println(res);
		}
	}

	static boolean findPrime(int n) {

		if(n ==1) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else if(n >2 &&  n%2==0) {
			return false;

		}
		else {
			for(int i =2 ; i*i <= n; i++) {
				System.out.println("ohoo ");
				if(n % i ==0) {
					System.out.println(i+ "is  ");
					return false;
				}

			}
		//	System.out.println("ohoo ");
			return true;

		}
	}

}


