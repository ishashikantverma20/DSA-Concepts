/**
 * Take a input n and print it decreasing using recursion.
 * input - 5
 * output -
 * 5
 * 4
 * 3
 * 2
 * 1
 *
 */
public class PrintDecreasingNumber {
	public static void main(String[] args) {
		int input = 5;
		printDecrease(input);
	}

	public  static void printDecrease(int n) {
		// base case
		if(n < 1) return;

		// print result
		System.out.println(n);
		printDecrease(n-1);
	}
}
