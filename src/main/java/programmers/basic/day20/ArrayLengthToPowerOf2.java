package programmers.basic.day20;

import java.util.Arrays;

public class ArrayLengthToPowerOf2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
    }

    public static int[] solution(int[] arr) {
        if ((arr.length & (arr.length - 1)) != 0) {
            int newLength = (int) Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2)));
            int[] array = Arrays.copyOf(arr, newLength);

            for (int i = arr.length; i < newLength; i++) {
                array[i] = 0;
            }

            return array;
        } else {
            return arr;
        }
    }

}
