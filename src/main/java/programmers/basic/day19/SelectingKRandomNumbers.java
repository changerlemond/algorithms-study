package programmers.basic.day19;

import java.util.*;

public class SelectingKRandomNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }

    public static int[] solution(int[] arr, int k) {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : arr) {
            if (uniqueNumbers.size() < k) {
                uniqueNumbers.add(number);
            }
        }

        List<Integer> result = new ArrayList<>(uniqueNumbers);
        if (result.size() < k) {
            for (int j = result.size(); j < k; j++) {
                result.add(-1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
