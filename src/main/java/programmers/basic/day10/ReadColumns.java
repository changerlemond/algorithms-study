package programmers.basic.day10;

public class ReadColumns {

    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(solution("programmers", 1, 1));
    }

    public static String solution(String my_string, int m, int c) {
        StringBuilder stringBuilder = new StringBuilder();
        int startIndex = c - 1;
        while (startIndex < my_string.length()) {
            stringBuilder.append(my_string.charAt(startIndex));
            startIndex += m;
        }
        return stringBuilder.toString();
    }

}
