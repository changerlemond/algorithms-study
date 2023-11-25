package programmers.basic.day5;

public class HandlingCode {

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }

    public static String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;
            else if (i % 2 == mode) answer.append(code.charAt(i));
        }
        return answer.toString().isEmpty() ? "EMPTY" : answer.toString();
    }

}
