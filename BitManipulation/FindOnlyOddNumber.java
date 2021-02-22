package BitManipulation;
//find the only odd occuring number 
public class FindOnlyOddNumber {
	public static void main(String args[ ]) {
		
	 int res =0;
	 int n=7;
	 int[ ] arr= new int[7];
	 arr[0]=4;
	 arr[1]=4;
	 arr[2]=arr[3]=arr[4]=3;
	 arr[5]=arr[6]=5;
		for(int i=0;i<n;i++) {
			//System.out.println(arr[i]);
			res = res ^ arr[i];
		}
		System.out.print(res);
	}
	
}
