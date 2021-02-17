
public class Main {

	public static void main(String[] args) {
		//Finding values of x and y in an equation
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y<= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("When 4x + 5y == 60, x = " + x +", y = " + y);
				}
			}
		}
	}
}


