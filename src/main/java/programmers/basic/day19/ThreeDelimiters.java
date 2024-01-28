package programmers.basic.day19;

import java.util.Arrays;

public class ThreeDelimiters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("baconlettucetomato")));
        System.out.println(Arrays.toString(solution("abcd")));
        System.out.println(Arrays.toString(solution("cabab")));
    }

    public static String[] solution(String myStr) {
        String[] array = myStr.replaceAll("b", "a").replaceAll("c", "a").split("a");
        if (array.length == 0) return new String[]{"EMPTY"};
        return Arrays.stream(array).filter(element -> !element.isEmpty()).toArray(String[]::new);
    }

}
