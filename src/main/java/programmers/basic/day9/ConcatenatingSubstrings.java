package programmers.basic.day9;

public class ConcatenatingSubstrings {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            result.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }
        return result.toString();
    }

}
