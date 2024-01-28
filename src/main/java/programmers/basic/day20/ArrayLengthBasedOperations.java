package programmers.basic.day20;

import java.util.Arrays;

public class ArrayLengthBasedOperations {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{49, 12, 100, 276, 33}, 27)));
        System.out.println(Arrays.toString(solution(new int[]{444, 555, 666, 777}, 100)));
    }

    public static int[] solution(int[] arr, int n) {
        for (int i = arr.length % 2 == 0 ? 1 : 0; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }

}
