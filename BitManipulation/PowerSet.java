package BitManipulation;

import java.util.Scanner;
//import java.math.*;

//generating power set using bit wise operators. T(C) = O((2power n) * n)

public class PowerSet {
	public static void main(String args[ ]) {
		System.out.println("Enter a String");

		try (Scanner sc = new Scanner(System.in)) {
			String str= sc.next();
			PowerSet.generatePowerset( str);
		}

	}

	static void generatePowerset(String s) {
		
		int n = s.length();
		int power = (int) (Math.pow(2, n)-1);
		for(int i =0; i<=power;i++) {
			for(int j=0;j<n;j++) {
				{
					if((i &(1<< j))!= 0) {
						System.out.print(s.charAt( j ));
						}
				}
				
			}
			System.out.print(" ,");

		}
	}

}
