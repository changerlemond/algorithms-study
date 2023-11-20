package programmers.level0.day24;

import java.util.Arrays;

public class NumberOfK {

    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution1(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution1(10, 50, 5));
        System.out.println(solution(3, 10, 2));
        System.out.println(solution1(3, 10, 2));
    }

    public static int solution(int i, int j, int k) {
        int result = 0;
        for (int l = i; l <= j; l++) {
            long count = Arrays.stream(String.valueOf(l).split("")).filter(element -> element.equals(String.valueOf(k))).count();
            result += (int) count;
        }
        return result;
    }

    public static int solution1(int i, int j, int k) {
        StringBuilder string = new StringBuilder();
        for(int a = i; a <= j; a++) {
            string.append(a);
        }

        return string.length() - string.toString().replace(k+"", "").length();
    }

}
