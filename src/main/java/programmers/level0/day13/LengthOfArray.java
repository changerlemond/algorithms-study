package programmers.level0.day13;

import java.util.Arrays;

public class LengthOfArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(solution(new String[]{"I", "Love", "Programmers."})));
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

}
