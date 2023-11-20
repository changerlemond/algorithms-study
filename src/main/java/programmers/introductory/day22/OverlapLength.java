package programmers.introductory.day22;

import java.util.HashMap;
import java.util.Map;

public class OverlapLength {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }

    public static int solution(int[][] lines) {
        int result = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int[] line : lines) {
            int tempMin = Math.min(line[0], line[1]);
            int tempMax = Math.max(line[0], line[1]);
            for (int i = tempMin + 1; i < tempMax + 1; i++) {
                String str = (i - 1) + "/" + i;
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        for (Integer value : map.values()) {
            if (value > 1) result++;
        }

        return result;
    }

}
