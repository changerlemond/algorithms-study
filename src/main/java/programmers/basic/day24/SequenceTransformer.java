package programmers.basic.day24;

import java.util.Arrays;

public class SequenceTransformer {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 2)));
    }

    public static int[] solution(int[] arr, int k) {
        if (k % 2 == 1) {
            arr = Arrays.stream(arr).map(element -> element * k).toArray();
        } else {
            arr = Arrays.stream(arr).map(element -> element + k).toArray();
        }
        return arr;
    }

}
