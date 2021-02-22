package BasicMaths;
//Lower bound means finding the index of the first element  in the sorted array whose values is not less than a  V

public class LowerBound {

	public static void main(String args[]) {
		int arr[] = { 2, 4, 5, 5, 6, 7, 7, 7, 8, 9 };
		int findNum = 9;
		LowerBound obj = new LowerBound();
		int numValue = obj.lowerBound(arr, findNum);
		System.out.print(numValue);

	}

	public  int lowerBound(int[] arr, int findNum) {
		// TODO Auto-generated method stub

		//System.out.println(" +");

		int high = arr.length - 1;
		int low = 0;

		while (high - low > 1) {
			int mid = (high + low) / 2;
			//System.out.println(mid);

			if (arr[mid] >= findNum) {

				high = mid;

			} else {
				low = mid +1;
			}

		}

		if (arr[low] >=findNum) {
			return low;
		}
		if (arr[high] >=findNum) {
			return high;
		}
		return -1;
	}
}
