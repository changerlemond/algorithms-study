package programmers.basic.day15;

import java.util.Arrays;

public class SequenceTransform1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98})));
    }

    public static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] <= 50 && arr[i] % 2 == 1) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

}
