package programmers.level0.day16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindLargestNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
    }

    public static int[] solution(int[] array) {
        int maxNumber = Arrays.stream(array).max().orElse(0);
        int index = IntStream.range(0, array.length)
                .reduce((i, j) -> array[i] > array[j] ? i : j)
                .orElse(0);
        return new int[]{maxNumber, index};
    }

}
