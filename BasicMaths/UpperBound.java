package BasicMaths;

//UpperBound means : in a sorted array, find the index of the first element which is greater than the number V
public class UpperBound {
	public static void main(String args[]) {
		int arr[] = { 2, 4, 5, 5, 6, 7, 7, 7,7,7,8,8, 8, 9,10 };
		int findNum = 9;
		UpperBound obj = new UpperBound();
		int numValue = obj.upperBound(arr, findNum);
		System.out.print(numValue);

	}

	int upperBound(int arr[], int num) {

		int high = arr.length - 1;
		int low = 0;

		while (high - low > 1) {
			int mid = (high + low) / 2;
			//System.out.println(mid);
			if (arr[mid] <= num) {
				low = mid + 1;

			} else {

				high = mid;

			}

		}

		if (arr[low] > num) {
			return low;
		}

		if (arr[high] > num) {
			return high;
		}
		
		return 0;

	}

}
