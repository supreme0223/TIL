import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

	public static void main(String[] args) {

		Solution sol = new Solution();
		System.out.println("Binary gap: " + sol.solution(10));
		
	}

}

class Solution {
	public int solution (int N) {
		int gap = 0;
		
		String binaryString = Integer.toBinaryString(N);
		char [] binarys = binaryString.toCharArray();
		List<Integer> position = new ArrayList();
		
		for (int i = 0; i < binarys.length; i++) {
			char b = binarys [i];
			if (b == '1') {
				position.add(i);
			}
		}
		
		if (position.size() > 1) {
			for (int i = 0; i < position.size() -1; i++) {
				int tmpGap = position.get(i + 1) - position.get(i) - 1;
				if (gap < tmpGap) {
					gap = tmpGap;
				}
			}
		}
				
		
		return gap;
	}
}
