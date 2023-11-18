/**
 *  Take a input n and print it increasing using recursion.
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


