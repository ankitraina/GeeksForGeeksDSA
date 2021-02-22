package BasicMaths;

public class Main {

	public static void main(String args[]) {
		int arr[] = { 2, 4, 5, 5, 6, 7, 7, 7,7,7,8,8, 8, 9,10  };
		int findNum =10;
		UpperBound up = new UpperBound();
		LowerBound lo = new LowerBound();
		int numOfOccur = up.upperBound(arr, findNum) - lo.lowerBound(arr, findNum);
		System.out.println(numOfOccur);
	}

}
