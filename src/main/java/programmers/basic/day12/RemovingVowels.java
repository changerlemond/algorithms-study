package programmers.basic.day12;

import java.util.*;

public class RemovingVowels {

    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }

    public static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

}
