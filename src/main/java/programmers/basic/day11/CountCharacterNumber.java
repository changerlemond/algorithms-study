package programmers.basic.day11;

import java.util.Arrays;

public class CountCharacterNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Programmers")));
    }

    public static int[] solution(String my_string) {
        int[] result = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                result[26 + c - 'a']++;
            }
        }
        return result;
    }

}
