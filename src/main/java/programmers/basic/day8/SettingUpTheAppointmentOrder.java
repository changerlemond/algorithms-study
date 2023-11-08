package programmers.basic.day8;

import java.util.Arrays;

public class SettingUpTheAppointmentOrder {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }

    public static int[] solution(int[] emergency) {
        int[] indexes = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            int rank = 1;
            for (int k : emergency) {
                if (k > emergency[i]) {
                    rank++;
                }
            }
            indexes[i] = rank;
        }
        return indexes;
    }

}
