package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String args[ ]) {


	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of disks ");
			int num1 = sc.nextInt();
			
			System.out.print("Enter from disk");
			int num2 = sc.nextInt();
			System.out.print("Enter to disk");
			int num3 = sc.nextInt();
			System.out.print("Enter Aux disk");
			int num4 = sc.nextInt();
			//countNumberOfDigits count = new countNumberOfDigits();
			long val = TowerOfHanoi.toh(num1, num2,num3, num4);
			System.out.println(val);

		}
}

	

	   
	
	 public static long toh(int N, int from, int to, int aux) {
	        // Your code here
	      
	        if(N==1){
	            System.out.println("move disk " + N  + " from rod " + from +" to rod " + to);
	            return 1;
	        }
	        
	        toh(N-1,from,aux, to);
	        System.out.println("move disk " + N + " from rod " + from +" to rod " + to);
	        toh(N-1, aux,to, from);
	        return (long)(Math.pow(2,N)-1);
	      
	    }
	}


