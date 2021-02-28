import java.util.*;

public class Distinct {

	public int solution(int[] A) {
        // write your code in Java SE 8
		//input = 2, 1, 1, 2, 3, 1
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        return set.size();
    }
}
