package programmers.basic.day6;

import java.util.Arrays;

public class LastTwoElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5})));
    }

    public static int[] solution(int[] num_list) {
        int first = num_list[num_list.length - 1];
        int second = num_list[num_list.length - 2];

        int last = (first > second) ? first - second : first * 2;

        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        result[num_list.length] = last;
        return result;
    }

}
