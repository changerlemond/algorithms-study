package programmers.basic.day13;

import java.util.Arrays;

public class ChangeOrder {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 3)));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] array1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] array2 = Arrays.copyOfRange(num_list, 0, n);

        int[] answer = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, answer, 0, array1.length);
        System.arraycopy(array2, 0, answer, array1.length, array2.length);

        return answer;
    }

}
