package Recursion;

import java.util.Scanner;

public class Fibonacci {
public static void main(String args[ ]) {
		
		
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			long val = Fibonacci.fibonacci(num);
			System.out.println(val);

}
}




static long fibonacci(int n)
{
    // your code here
    if(n==0)
      return 0;
    
    if(n==1)
       return  1;
    if(n==2)
       return  1;
    long sum = fibonacci(n-1) + fibonacci(n-2);
    return sum;
}
}