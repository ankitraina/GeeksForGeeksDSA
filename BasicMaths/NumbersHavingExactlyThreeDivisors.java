package BasicMaths;
//task is to find the numbers less than N having exactly 3 divisors.

import java.util.Scanner;

public class NumbersHavingExactlyThreeDivisors {
	public static void main(String args[ ]) {
		System.out.print("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();

			int res= NumbersHavingExactlyThreeDivisors .findDivisors(num);
			System.out.println(res);
		}
	}

	static int findDivisors(int n) {
		int total =0,count =2;
		if(n ==1) {
			count =1;
		}
		else if(n==2) {
			count =2;
		}
            while(n>2) {
			for(int i =2 ; i*i <=n; i++) {

				if(n >4 &&  n%2==0) {
					n--;
					continue;
				}


				if(n % i ==0) {
                    count++;
					if(i != n/i) {
						count++;
					}
				}
			}
			if(count==3) {
				total = total+1;
			}
			count =2;
			n--;
		}

		return total;

	}
}
