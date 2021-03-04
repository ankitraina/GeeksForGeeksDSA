package Array;
//does find Second largest element in the array in time O(N) but takes two traversals of the array

public class Secondlargest {

	public static void main(String args[]) {
		int arr[] = { 10,10,10,10,10 };
		int largestNumber = getLargest(arr);
		int res = -1;
		System.out.println(largestNumber);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != largestNumber) {

				if (arr[i] > res) {
					res = arr[i];
				}
			}
		}

		System.out.println(res);

	}

	static int getLargest(int arr[]) {

		int res = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > res) {
				res = arr[i];

			}
		}
		return res;

	}

}