package BasicMaths;

import java.util.Scanner;

public class SortedDivisors {

	public static void main(String args[ ]) {
		System.out.print("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			SortedDivisors.findDivisor(num);
		}
	}

	static void  findDivisor(int n) {

		int i;
		for(i=1; i *i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

		for( ; i>=1;i--) {
			if(n%i==0) {
				System.out.println(n/i);
			}
		}
	}
}



