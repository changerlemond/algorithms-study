package programmers.level0.day2;

import java.util.Arrays;

public class AddingFractions {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분자 구하기
        int numerator = numer1 * denom2 + numer2 * denom1;
        // 분모 구하기
        int denominator = denom1 * denom2;

        // 분자와 분모의 최대 공약수 구하는 반복문
        for (int i = numerator - 1; i > 1; i--) {
            // 최대 공약수 검사
            if (numerator % i == 0 && denominator % i == 0) {
                // 최대 공약수 인 경우 약분
                numerator /= i;
                denominator /= i;
            }
        }
        // 약분이 끝난 결과 값을 배열로 만들어 반환
        return new int[]{numerator, denominator};
    }

}
