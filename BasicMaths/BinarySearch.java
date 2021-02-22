package BasicMaths;
//binary search without recursion


public class BinarySearch {

	public static void main(String args[]) {
		int arr[] = { 2, 4, 5, 5, 6, 7, 7, 7, 8, 9 };
		int findNum = 10;
		BinarySearch obj = new BinarySearch();
		int numValue = obj.binarySearch(arr, findNum);
		System.out.println("The index is " + numValue);
	}

	int binarySearch(int arr[], int n) {

		int high = arr.length - 1;
		int low = 0;

		while (high - low > 1) {

			System.out.println("+");

			int mid = (high + low) / 2;
			if (arr[mid] == n) {
				return mid;
			}
			if (arr[mid] < n) {
				low = mid + 1;

			}

			if (arr[mid] > n) {
				high = mid - 1;
			}

		}

		if (arr[low] == n) {
			return low;
		}
		if (arr[high] == n) {
			return high;
		}
		return n;

	}

}
