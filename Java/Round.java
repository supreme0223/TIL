package test.final_;

public class Round {

	final static double PI = 3.14;
	public static void main(String[] args) {

		double r = 2.54;
		double area = r * r * PI;
		double doubledArea = Math.round(area * 1000.0) / 1000.0;
		System.out.println("The area of circle = " + doubledArea);
	}

}
