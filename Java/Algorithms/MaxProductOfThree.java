import java.util.*;

public class MaxProductOfThree {

	public int solution(int[] A) {
        // write your code in Java SE 8
		// input = -3, 1, 2, -2, 5, 6
        Arrays.sort(A); // sorting in ascending order = -3, -2, 1, 2, 5, 6

        int li = A.length - 1;
        int num = A[li];
        int leftNum = num * A[li - 1] * A[li - 2];
        int rightNum = num * A[0] * A[1];

        return Math.max(leftNum, rightNum);
    }
}
