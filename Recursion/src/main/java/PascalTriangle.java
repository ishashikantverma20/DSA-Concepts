import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *                                  1             -- 0th level
 *                                1  1            -- 1st level
 *                              1  2   1          -- 2nd level
 *                            1  3   3   1        -- 3rd level
 *
 *  Input: rowIndex = 3
 *  Output: [1,3,3,1]
 */
public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(getRow(3));
	}

	public static List<Integer> getRow(int rowIndex) {
		//base case
		if(rowIndex == 0)
			return Arrays.asList(1);

		// call
		List<Integer> res = getRow(rowIndex - 1);

		// process
		List<Integer> temp = new ArrayList<>();
			// add first 1
			temp.add(1);
				for(int i = 0; i<rowIndex-1; i++) {
					// adding first and seocnd index number and setting to 2nd index in result
					temp.add(i+1, res.get(i) + res.get(i+1));
				}
			// add last 1
			temp.add(1);

		return temp;
	}
}
