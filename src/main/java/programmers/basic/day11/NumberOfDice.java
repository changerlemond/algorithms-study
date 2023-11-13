package programmers.basic.day11;

import java.util.Arrays;

public class NumberOfDice {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1}, 1));
        System.out.println(solution(new int[]{10, 8, 6}, 3));
    }

    public static int solution(int[] box, int n) {
        int[] array = Arrays.stream(box).map(number -> number / n).toArray();
        int result = 1;
        for (int j : array) result *= j;
        return result;
    }

}
