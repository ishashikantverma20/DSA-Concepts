/**
 *  Take a input n and print it increasing using recursion.
 *
 *  input - 5
 *  output -
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 */
public class PrintIncreasingNumber {
    public static void main(String[] args) {
        int input = 5;
        printIncrease(5);
    }

    public static void printIncrease(int n) {
        // base condition
        if(n < 1) {
            return;
        }

        printIncrease(n-1);
        // print result
        System.out.println(n);
    }
}


