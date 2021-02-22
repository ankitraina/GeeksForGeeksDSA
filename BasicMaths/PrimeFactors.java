package BasicMaths;

//time complexity O(n^2logn)
import java.util.Scanner;

public class PrimeFactors {
	public static void main(String args[ ]) {
		System.out.print("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
            PrimeFactors.isAPrimeFactor(num);
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
			
				if(n % i ==0) {

					return false;
				}

			}

			return true;
       }
	}

	static void  isAPrimeFactor(int b) {
		for(int i =2;i<b;i++) {
			if(PrimeFactors.findPrime(i)) {
				int x =i;
				while(b % x ==0) {
					System.out.println(i);
					x=x*i;
				}
			}
		}
	}
}

