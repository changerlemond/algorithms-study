package programmers.basic.day9;

import java.util.ArrayList;
import java.util.Arrays;

public class SuffixArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("programmers")));
    }

    public static String[] solution(String my_string) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= my_string.length(); i++) {
            result.add(my_string.substring(my_string.length() - i));
        }
        return result.stream().sorted().toArray(String[]::new);
    }

}
