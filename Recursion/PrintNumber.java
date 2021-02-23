package Recursion;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String args[ ]) {
		
			
			System.out.print("Enter a number ");
			try (Scanner sc = new Scanner(System.in)) {
				int num = sc.nextInt();
				//countNumberOfDigits count = new countNumberOfDigits();
				PrintNumber.printNos(num);
				//System.out.println();
			}

}

    
  static void printNos(int N)
    {
        //Your code here
       if(N>0){
        printNos(N-1);
        System.out.println(  N + " ");
       }if(N==0){
           return ;
       }
        
   
    
}}