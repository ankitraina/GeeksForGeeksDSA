package Recursion;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[ ]) {
		
		
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			int val = SumOfDigits.sumOfDigits(num);
			System.out.println(val);
		}

	

}


public static int sumOfDigits(int n)
{
    // add your code here
    if(n ==0){
        return 0;
    }
    int num = n%10 + sumOfDigits(n/10);
    return num;
    
}
}
