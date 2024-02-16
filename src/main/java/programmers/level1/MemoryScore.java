package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MemoryScore {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}
                })
        ));
        System.out.println(Arrays.toString(solution(
                new String[]{"kali", "mari", "don"},
                new int[]{11, 1, 55},
                new String[][]{
                        {"kali", "mari", "don"},
                        {"pony", "tom", "teddy"},
                        {"con", "mona", "don"}
                })
        ));
        System.out.println(Arrays.toString(solution(
                        new String[]{"may", "kein", "kain", "radi"},
                        new int[]{5, 10, 1, 3},
                        new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}}
                )
        ));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];

        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            String[] names = photo[i];
            int score = 0;

            for (String s : names) {
                if (hashMap.containsKey(s)) {
                    score += hashMap.get(s);
                }
            }

            result[i] = score;
        }

        return result;
    }

}
