package programmers.level1;

import java.util.Arrays;

public class SortCharactersByCustomRule {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] result = new String[strings.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(result);

        for (int i = 0; i < result.length; i++) {
            result[i] = result[i].substring(1);
        }

        return result;
    }

}
