package programmers.basic.day3;

public class ShuffleStrings {

    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    public static String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }

}
