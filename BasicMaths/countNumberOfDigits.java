package BasicMaths;

import java.util.Scanner;

public class countNumberOfDigits {
	
	
public static void main(String args[ ]) {
    System.out.print("Enter a number ");
	try (Scanner sc = new Scanner(System.in)) {
		int num = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		int val = countNumberOfDigits.numberOfDigitsIs(num);
		System.out.print(val);
	}
}

 static int numberOfDigitsIs(int value) {
	 
	 int count =0;
	 while(value!=0) {
	 value = value /10;
	//System.out.println(count);
	 count++;
	 }
	 return count;
	
}
	
}
