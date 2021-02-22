package BasicMaths;

import java.util.Scanner;

public class CountTrailingZeros {
	public static void main(String args[ ]) {
		int num=0;
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			 num = sc.nextInt();
		}
		num = CountTrailingZeros.numberOfTrailingZeros(num);
		System.out.print(num);


		}
	
	static int numberOfTrailingZeros(int num) {
		int res =0;
		for(int i=5; i<=num ; i=i*5) {
			res = res + num/i;
}
		return res ;
}
}