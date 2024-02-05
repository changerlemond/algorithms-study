package programmers.level1;

import java.util.Arrays;

public class ReverseNaturalArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        String numberString = Long.toString(n);
        String reverse = new StringBuilder(numberString).reverse().toString();
        int[] array = new int[reverse.length()];
        for (int i = 0; i < reverse.length(); i++) {
            array[i] = Character.getNumericValue(reverse.charAt(i));
        }
        return array;
    }

}
