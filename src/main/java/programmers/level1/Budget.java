package programmers.level1;

import java.util.Arrays;

public class Budget {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(solution(new int[]{2, 2, 3, 3}, 10));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 1}, 7));
    }

    public static int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for (int i : d) {
            if (i <= budget) {
                budget -= i;
                count ++;
            }
        }
        return count;
    }

}
