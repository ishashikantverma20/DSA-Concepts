/**
 *  Reverse a string
 *  input - ['h', 'e', 'l', 'l', 'o']
 *  output - [o, l, l, e, h]
 *
 *  logic  h e l l o
 *         ^       ^
 *           ^   ^
 *             ^^
 */
public class ReverseString {
	public static void main(String[] args) {
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		int len = s.length;
		reverseString(s, 0, len - 1);
	}

	private static void reverseString(char [] s,int start, int end) {
		//base case
		if (start >= end) {
			return;
		}

		// swap between the first and the last elements.
		char tmp = s[start];
		s[start] = s[end];
		s[end] = tmp;

		//call
		reverseString(s,start + 1, end - 1);
	}
}
