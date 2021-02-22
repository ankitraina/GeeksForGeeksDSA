package BasicMaths;

import java.util.Scanner;

public class PrimeFactorOptimized {
	public static void main(String args[ ]) {
		System.out.print("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			PrimeFactorOptimized.isAPrimeFactor(num);
		}
}

	static void  isAPrimeFactor(int n) {
		for(int i =2; i*i<=n; i++) {
			while(n % i ==0) {
				System.out.println(i);
				n = n / i ;
			}
		}
		if(n > 1) {
			System.out.println(n);
		}
	}
}