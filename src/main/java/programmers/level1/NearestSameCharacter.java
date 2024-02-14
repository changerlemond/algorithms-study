package programmers.level1;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class NearestSameCharacter {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }

    public static int[] solution(String s) {
        LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (list.containsKey(s.charAt(i))) {
                result[i] = Math.abs(list.get(s.charAt(i)) - i);
                list.put(s.charAt(i), i);
            } else {
                list.put(s.charAt(i), i);
                result[i] = -1;
            }
        }
        return result;
    }

}
