package programmers.introductory.day19;

import java.util.Arrays;

public class SplittingIntoArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(solution("abcdef123", 3)));
    }

    public static String[] solution(String my_str, int n) {
        return my_str.split("(?<=\\G.{" + n + "})");
    }

}
