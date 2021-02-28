
public class TapeEquilibrium {

	public int solution(int[] A) {
        // write your code in Java SE 8
        int sum1 = 0;
        int sum2 = 0; //input 3,1,2,4,3
        int ans = 0;
        for (int i = 0; i < A.length; i++){
            sum1 += A[i]; //sum1 = 3 + 1 + 2 + 4 + 3 = 13
            
        }

        for (int i = 0; i < A.length -1; i++){
            sum2 += A[i]; //sum2 = 3 + 1 + 2 + 4 = 10
            int calc = Math.abs(sum2 - (sum1 - sum2)); //3 - (13 - 3) = 7 //11 - (13 -  8) = 6
            if (i == 0){
                ans = calc; //ans = 7
                Math.min (ans, calc);
            }
            if (calc < ans){
                ans = calc;
            }
        } return ans;
    } 
}
