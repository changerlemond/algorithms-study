package programmers.basic.day5;

import java.util.Arrays;

public class ProductSumOfElements {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        return Arrays.stream(num_list).reduce(1, (a, b) -> a * b) < Math.pow(Arrays.stream(num_list).sum(), 2) ? 1 : 0;
    }

}
