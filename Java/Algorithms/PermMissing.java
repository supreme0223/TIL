
public class PermMissing {

	public int solution(int[] A) {
		int sum = 0; //input = 2,3,1,5
        for(int i = 1; i <= A.length + 1; i++) {
            sum += i; //1+2+3+4+5 = 15 = sum
        }
        
        for(int i = 0; i < A.length; i++) {
            sum -= A[i];
        }
        return sum;
    }
}
