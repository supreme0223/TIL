
public class MinMaxDivision {

	public int solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int sum = 0;
        int sum2 = 0;
        int div = A.length / K;

        for (int i = 0; i < div; i++){
            int maxRead = div * (i+1);
            if ((i + 1) == K){
                maxRead = K;
            }

            for (int j = div * i; j < maxRead; j++){
                sum = sum + A[j];
            }

            if (sum > sum2 || sum2 == 0){
                sum2 = sum;
                sum = 0;
            }
        } return sum2;
    }
}
