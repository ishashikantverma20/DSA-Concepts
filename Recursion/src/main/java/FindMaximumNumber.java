public class FindMaximumNumber {
	public static void main(String[] args) {

		int[] arr = {15, 45, 34, 55, 37};
		int index = 0;
		int result = findMax(arr, index);
		System.out.println(result);
	}

	private static int findMax(int[] arr, int index) {
		//base case
		if(index == arr.length) {
			return Integer.MIN_VALUE;
		}

		//process
		// comparing max of current value and returned value
		return Math.max(arr[index], findMax(arr, index + 1));
	}
}
