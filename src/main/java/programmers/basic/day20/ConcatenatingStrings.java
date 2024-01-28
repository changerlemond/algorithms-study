package programmers.basic.day20;

import java.util.HashMap;
import java.util.Map;

public class ConcatenatingStrings {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","bc","d","efg","hi"}));
    }

    public static int solution(String[] strArr) {
        Map<Integer, Integer> groupCounts = new HashMap<>();
        for (String str : strArr) {
            int length = str.length();
            groupCounts.merge(length, 1, Integer::sum);
        }

        return groupCounts.values().stream().max(Integer::compareTo).orElse(0);
    }

}
