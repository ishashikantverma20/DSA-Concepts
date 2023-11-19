public class FindLastIndex {
	public static void main(String[] args) {
		int[] arr = {3, 10, 2, 7, 18, 2, 9, 10};
		int index = 0;
		int num = 2;
		int result = findLast(arr, index, num);
		// Approach 2 input
		//int result = findLast(arr, arr.length - 1, num);
		System.out.println(result);
	}

	//Approach 1:

	private static int findLast(int[] arr, int index, int num) {
		//base case
		if(arr.length == index) return -1;

		//process
		int lastIdx = findLast(arr, index + 1, num);

		// this will execute only till we find original index
		if(lastIdx == -1 && arr[index] == num) {
			return index;
		} else {
			return  lastIdx;
		}
	}

	//Approach 2:

//	private static int findLast(int[] arr, int lastIndex, int num) {
//		//base case
//		if(lastIndex < 0)
//			return -1;
//
//		//process
//		if (arr[lastIndex] == num)
//			return lastIndex;
//
//		return findLast(arr, lastIndex - 1, num);
//
//	}


}
