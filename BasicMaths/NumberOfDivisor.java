package BasicMaths;

import java.util.Scanner;

public class NumberOfDivisor {

	public static void main(String args[ ]) {
		System.out.print("Enter the number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			NumberOfDivisor.exactly3Divisors(num);
		}
	}

	static void exactly3Divisors(int N)
	{
		//Your code here
		int total=0, count =2;
		int i;
		while(N>2) {
			
			for(i=2; 2*i <=N;i++) {
//				if((N%2)==0 && N>4) {
//					break;
//					
//				}
				if(N % i==0) {
					count = count +1;
					System.out.println( count);
				}
				
//				if(count>=4) {
//					break;
//				}
				//System.out.println( count);
				if(i==(N/i)){
				    count=count +1;
				}
			}
			
			
			if(count ==3) {
				total = total +1;
			}
			N--;
			count =2;
		}
		
		System.out.println( total);
			
		}
		
}

