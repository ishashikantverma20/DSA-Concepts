/**
 *  Calculate factorial of a given number.
 *  input - 5
 *  output - 120
 *
 */
public class Factorial {
	public static void main(String[] args) {
		int input = 5;
		int result = factorial(input);
		System.out.println(result);
	}

	public static  int factorial(int n) {
		// base case
		 if(n < 1) return 1;

		 // it is like 5 * 4!
		 return n * factorial(n - 1);

	}


}
