import java.util.Arrays;

public class MissingInteger {

	public int solution(int[] A) { 
		
		Arrays.sort(A); //input = 1,3,6,4,1,2 // sorting in ascending order = 1 1 2 3 4 6
		int ans = 1; 
		
		if(A[A.length - 1] <= 0){ 
			return 1; 
		} 
		
		for(int i=0; i < A.length; i++){ 
			if(A[i] > 0 && A[i] == ans){ 
				ans++; //2, 3
			} 
		} 
		return ans; 
		
	}
}
