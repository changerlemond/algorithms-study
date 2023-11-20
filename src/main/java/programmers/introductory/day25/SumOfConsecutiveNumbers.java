package programmers.introductory.day25;

import java.util.Arrays;

public class SumOfConsecutiveNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(5, 15)));
        System.out.println(Arrays.toString(solution(4, 14)));
        System.out.println(Arrays.toString(solution(5, 5)));
    }

    public static int[] solution(int num, int total) {
        int[] result = new int[num];
        int start = (total / num) - ((num - 1) / 2);

        for(int i = 0; i < num; i++) {
            result[i] = start;
            start++;
        }

        return result;
    }

}
