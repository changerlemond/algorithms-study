package programmers.level0.day24;

import java.util.Arrays;

public class AConvertB {

    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
        char[] beforeCharArray = before.toCharArray();
        char[] afterCharArray = after.toCharArray();

        Arrays.sort(beforeCharArray);
        Arrays.sort(afterCharArray);

        String beforeString = new String(beforeCharArray);
        String afterString = new String(afterCharArray);

        return beforeString.equals(afterString) ? 1 : 0;
    }

}
