package programmers.basic.day18;

import java.util.Arrays;

public class SplittingSortingStrings {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("axbxcxdx")));
        System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
    }

    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(element -> !element.isEmpty()).sorted().toArray(String[]::new);
    }

}
