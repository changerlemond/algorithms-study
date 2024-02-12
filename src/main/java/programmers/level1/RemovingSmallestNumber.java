package programmers.level1;

import java.util.Arrays;

public class RemovingSmallestNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }

    public static int[] solution(int[] arr) {
        int[] result = Arrays.stream(arr).filter(element -> element != Arrays.stream(arr).min().getAsInt()).toArray();
        return result.length > 0 ? result : new int[]{-1};
    }

}
