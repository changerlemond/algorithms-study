package programmers.level0.day5;

import java.util.Arrays;

public class IceAmericano {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }

    public static int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }

}
