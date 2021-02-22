package BasicMaths;

import java.util.Scanner;
//prints all divisors but not in sorted order

public class Divisors {
	public static void main(String args[ ]) {
		System.out.print("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			Divisors.findDivisor(num);
		}
}

	static void  findDivisor(int n) {
		for(int i=1; i*i<=n;i++) {
			
			if(n%i==0) {
				System.out.println(i);
			if(i != n/i) {
				System.out.println(n/i);
				}
			
			}
		
		}
		
	}
}


