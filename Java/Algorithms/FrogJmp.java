
public class FrogJmp {

	public static void main(String[] args) {
	
		Solution sol = new Solution();
		System.out.println(sol);
	}
	
	public int Solution (int X, int Y, int D) {
		int dist = Y - X;
		int count = dist / D;
		return ((dist % D) == 0) ? count : count + 1;
	}

}
