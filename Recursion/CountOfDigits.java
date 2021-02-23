package Recursion;

import java.util.Scanner;

public class CountOfDigits {
public static void main(String args[ ]) {
		
		
		System.out.print("Enter a number ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			int val = CountOfDigits.countDigits(num);
			System.out.println(val);

}
}

public static int countDigits(int n)
{
    // add your code here
    
    if(n<10){
        return 1;
    }

    
    int count =countDigits(n/10);
    count++;
    return count;
    
 }
}