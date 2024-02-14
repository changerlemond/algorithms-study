package programmers.level1;

import java.util.Arrays;

public class SecretMap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution1(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
        System.out.println(Arrays.toString(solution1(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] array1 = new String[n];
        String[] array2 = new String[n];
        String[] result = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            array1[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            array2[i] = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                stringBuilder.append(((array1[i].toCharArray()[j] == '0' && array2[i].toCharArray()[j] == '0') ? " " : "#"));
                result[i] = stringBuilder.toString();
            }
        }

        return result;
    }

    public static String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }

}
