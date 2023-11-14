package programmers.level0.day14;

import java.util.Arrays;
import java.util.Comparator;

public class NearestNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
    }

    public static int solution(int[] array, int n) {
        return Arrays.stream(array)
                .boxed()
                .min(Comparator.comparingInt((Integer a) -> Math.abs(a - n))
                        .thenComparingInt(a -> a))
                .orElseThrow();
    }

}
