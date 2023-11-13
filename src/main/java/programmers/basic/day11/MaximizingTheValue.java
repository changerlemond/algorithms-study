package programmers.basic.day11;

import java.util.Arrays;

public class MaximizingTheValue {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }

    public static int solution(int[] numbers) {
        int[] sort = Arrays.stream(numbers).sorted().toArray();
        return sort[sort.length - 1] * sort[sort.length - 2];
    }

}
