package programmers.basic.day12;

import java.util.Arrays;

public class SortString1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }

    public static int[] solution(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .sorted()
                .map(Character::getNumericValue)
                .toArray();
    }

}
