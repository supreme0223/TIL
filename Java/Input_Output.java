package test.final_;

import java.util.Scanner;

public class Input_Output {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //Input Method
		System.out.print("Enter seconds: "); //Statement for input
		int ansSec = sc.nextInt(); //Integer type for input
		int min = ansSec / 60; //Equation for minute 
		int sec = ansSec % 60; //Equation for seconds
		System.out.println();
		System.out.println("Time: " + min + " mins " + sec + " seconds");
		
		
	}

}
