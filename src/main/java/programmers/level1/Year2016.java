package programmers.level1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Year2016 {

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
        System.out.println(solution2(5, 24));
    }

    public static String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().name().substring(0, 3);
    }

    public static String solution2(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, new Locale("ko-KR")).toUpperCase();
    }

}
