package Array;

//Time complexity of this solution to find largest element in array is O(n)

public class LargestElement {
	
	public static void main(String args[]) {
		
		int arr[] = {499,5,2,5,6,7,8,9,10,11,44,49,38,31,59};
		int res=0, s=0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i]>res){
				res= arr[i];
				s = i;
				
			}
			
		}
		
		System.out.println(s);
	}

}
