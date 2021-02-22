package BasicMaths;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String args[ ]) {
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();

			int fact = FindFactorial.findFact(num);
			System.out.print(fact);
		}
	}
	static int findFact(int num) {
		

		if(num ==1 || num ==0) {
			return 1;}

		return	num * findFact(num-1);

	}

}


