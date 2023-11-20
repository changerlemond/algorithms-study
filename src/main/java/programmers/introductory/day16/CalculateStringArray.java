package programmers.introductory.day16;

import java.util.Arrays;

public class CalculateStringArray {

    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }

    public static int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "")
                .trim()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
    }

}
