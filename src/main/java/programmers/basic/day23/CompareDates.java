package programmers.basic.day23;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CompareDates {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(solution(new int[]{1014, 10, 24}, new int[]{1014, 10, 24}));
    }

    public static int solution(int[] date1, int[] date2) {
        return ChronoUnit.DAYS.between(LocalDate.of(date1[0], date1[1], date1[2]), LocalDate.of(date2[0], date2[1], date2[2])) > 0 ? 1 : 0;
    }

}
