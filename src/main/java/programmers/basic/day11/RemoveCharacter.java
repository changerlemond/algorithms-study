package programmers.basic.day11;

import java.util.Arrays;

public class RemoveCharacter {

    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }

    public static String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder stringBuilder = new StringBuilder(my_string);
        for (int i = indices.length - 1; i >= 0; i--) {
            if (indices[i] < stringBuilder.length()) {
                stringBuilder.deleteCharAt(indices[i]);
            }
        }
        return stringBuilder.toString();
    }

}
