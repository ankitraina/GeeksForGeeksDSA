package BitManipulation;

public class FindOneMissingNumber {

	//given an array of n  number having values in the range [1...n+1]. Every no. exactly once. Find the missing number 
	public static void main(String args[ ]) {

		int res =0;
		int n=7;
		int[ ] arr= new int[7];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=8;
		for(int i=0;i<n;i++) {
			//System.out.println(arr[i]);
			res = res ^ arr[i];
			//System.out.println(res);
		}
				for(int i=1;i<9;i++) {
			    res = res ^ i;
		}
				System.out.println(res);
	}
}
