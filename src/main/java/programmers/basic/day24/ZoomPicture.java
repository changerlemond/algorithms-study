package programmers.basic.day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZoomPicture {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."},
                2)
        ));
        System.out.println(Arrays.toString(solution(new String[]{"x.x", ".x.", "x.x"}, 3)));
    }

    public static String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for (String s : picture) {
            StringBuilder repeat = new StringBuilder();
            char[] array = s.toCharArray();
            for (char c : array) {
                repeat.append(String.valueOf(c).repeat(k));
            }
            for (int m = 0; m < k; m++) {
                answer.add(repeat.toString());
            }
        }
        return answer.toArray(new String[0]);
    }

}
