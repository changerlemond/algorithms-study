package programmers.basic.day17;

import java.util.Arrays;

public class SeparateByWhitespace1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
        System.out.println(Arrays.toString(solution("programmers")));
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }

}
