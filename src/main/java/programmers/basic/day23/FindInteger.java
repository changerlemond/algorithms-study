package programmers.basic.day23;

import java.util.Arrays;

public class FindInteger {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(solution(new int[]{15, 98, 23, 2, 15}, 20));
    }

    public static int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(element -> element == n) ? 1 : 0;
    }

}
