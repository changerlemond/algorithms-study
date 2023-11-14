package programmers.level0.day13;

import java.util.Arrays;

public class TriangleCompletionConditions {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 6, 2}));
        System.out.println(solution(new int[]{199, 72, 222}));
    }

    public static int solution(int[] sides) {
        int max = Arrays.stream(sides).max().orElseThrow();
        if (Arrays.stream(sides).sum() - max > max) return 1; else return 2;
    }

}
