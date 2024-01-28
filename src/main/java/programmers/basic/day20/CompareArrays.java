package programmers.basic.day20;

import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{49, 13}, new int[]{70, 11, 2}));
        System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
    }

    public static int solution(int[] arr1, int[] arr2) {
        int result = 0;
        if (arr1.length > arr2.length) {
            result = 1;
        } else if (arr1.length < arr2.length) {
            result = -1;
        } else {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();

            if (sum1 > sum2) {
                result = 1;
            } else if (sum1 < sum2) {
                result = -1;
            }
        }
        return result;
    }

}
