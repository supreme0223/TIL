
public class Main {

	public static void main(String[] args) {
		/* int result = 0;
			for (int i = 1; i < 101; i++) {
				
				if (i%3 == 0) {
					
					result = result + i;
				}
			}
		System.out.println("The sum of 3's mutiple is " + result); */
		
			
			
			while(true) {
				int d1 = (int) (Math.random() * 6) + 1; //Math.random results in double type, so it should be multiplied by 6 and add 1 for a dice
				int d2 = (int) (Math.random() * 6) + 1;
				
				if (d1 + d2 != 5) {
					System.out.println("The result: (" + d1 + ")," + "(" + d2 + ")");
				}
				else {
					System.out.println("The result: (" + d1 + ")," + "(" + d2 + ")");
					break;
				}
			}
			
			
		}
		
		
		
	}


