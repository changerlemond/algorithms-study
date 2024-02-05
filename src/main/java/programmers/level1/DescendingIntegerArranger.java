package programmers.level1;

import java.util.Arrays;

public class DescendingIntegerArranger {

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array);

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : array) {
            stringBuilder.append(s);
        }

        return Long.parseLong(stringBuilder.reverse().toString());
    }

}
