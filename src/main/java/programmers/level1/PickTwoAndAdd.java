package programmers.level1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PickTwoAndAdd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(solution(new int[]{5, 0, 2, 7})));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> list = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
