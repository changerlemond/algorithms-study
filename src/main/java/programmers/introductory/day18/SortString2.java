package programmers.introductory.day18;

import java.util.Arrays;

public class SortString2 {

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }

    public static String solution(String my_string) {
        char[] array = my_string.toLowerCase().toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

}
