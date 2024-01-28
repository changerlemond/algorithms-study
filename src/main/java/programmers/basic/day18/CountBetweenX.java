package programmers.basic.day18;

import java.util.Arrays;

public class CountBetweenX {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("oxooxoxxox")));
        System.out.println(Arrays.toString(solution("xabcxdefxghi")));
    }

    public static int[] solution(String myString) {
        String[] array = myString.split("x", -1);
        return Arrays.stream(array).mapToInt(String::length).toArray();
    }

}
