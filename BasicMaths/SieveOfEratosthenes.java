package BasicMaths;

import java.util.Arrays;

public class SieveOfEratosthenes{
	static int n=50;
	public static void main(String args[ ]) {

		Boolean arr[ ] = new Boolean[n+1];

		Arrays.fill(arr, Boolean.TRUE);

		SieveOfEratosthenes.findNumber(arr);

	}

	static void findNumber(Boolean arr1[]) {

		for(int i=2;i*i<n;i++) {
			if(arr1[i]) {
				for(int j=i*i;j<=n;j=j+i) {
					arr1[j]= false;
				}
			}  
		}

		for(int i=2;i<=n;i++) {
			if(arr1[i]) {
				System.out.println(i);
			}

		}
	}
}





