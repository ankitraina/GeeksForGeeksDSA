package BitManipulation;
import java.util.Scanner;

//count the total number of set bits in binary representation from 1 to N numbers. Naive approach.Takes O(32n) time
public class CountTotalSetBits {


	public static void main(String args[ ]) {
		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//countNumberOfDigits count = new countNumberOfDigits();
		int val = CountTotalSetBits.countSetBits(num);
		System.out.println(val);



	}


	static int countSetBits(int n){

		// Your code here
		int m, count=0,total =0;

		while(n >0){
			for(int i=0;i<21;i++){

				m =  (n & (1<<(i)));
				if((n & m)!=0){
					count++;
				}
			}
			total = total + count;
			count =0;
			n--;
		}
		return total;

	}
}