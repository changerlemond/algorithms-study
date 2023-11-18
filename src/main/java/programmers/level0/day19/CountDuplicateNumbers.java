package programmers.level0.day19;

import java.util.Arrays;

public class CountDuplicateNumbers {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution(new int[]{0, 2, 3, 4}, 1));
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(number -> number == n).count();
    }

}
