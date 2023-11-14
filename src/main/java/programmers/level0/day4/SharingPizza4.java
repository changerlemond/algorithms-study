package programmers.level0.day4;

import java.util.Arrays;

public class SharingPizza4 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}