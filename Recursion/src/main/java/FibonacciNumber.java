/**
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 *                  4
 *                 |  \
 *                3    2
 *               | \  | \
 *              2  1  1  0
 *             r1  r1 r1 r0
 */
public class FibonacciNumber {
	public static void main(String[] args) {

		int n = 5;
		int result = fibo(n);

		System.out.println(result);
	}

	public static int fibo(int n) {
		//base case
		if(n <= 1) {
			return n;
		}

		//process
		return fibo(n - 1) + fibo(n - 2);
	}
}
