package programmers.level1;

import java.util.Arrays;

public class ArrayOfDividingNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 6}, 10)));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(element -> element % divisor == 0).sorted().toArray();
        return result.length == 0 ? new int[]{-1} : result;
    }

}
