package programmers.basic.day8;

public class RepeatedStringReversal {

    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder stringBuilder = new StringBuilder(my_string);
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            StringBuilder string = new StringBuilder(stringBuilder.substring(start, end + 1));
            string.reverse();
            stringBuilder.replace(start, end+1, string.toString());
        }
        return stringBuilder.toString();
    }

}
