package programmers.introductory.day9;

import java.math.BigInteger;

public class TheNumberOfWaysToDistributeMarbles {

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
    }

    public static int solution(int balls, int share) {
        BigInteger result = BigInteger.ONE;
        int min = Math.min(share, balls - share);

        for (int i = 0; i < min; i++) {
            result = result.multiply(BigInteger.valueOf(balls - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }

        return result.intValue();
    }

}
