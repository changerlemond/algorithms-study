package programmers.basic.day17;

import java.util.Arrays;

public class RemoveAD {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"and", "notad", "abcd"})));
        System.out.println(Arrays.toString(solution(new String[]{"there", "are", "no", "a", "ds"})));
    }

    public static String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(element -> !element.contains("ad")).toArray(String[]::new);
    }

}
