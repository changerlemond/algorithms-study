package programmers.level0.day21;

public class HiddenNumberAddition {

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] strings = my_string.split("[a-zA-Z]");
        for (String string : strings) {
            answer += !string.isEmpty() ? Integer.parseInt(string) : 0;
        }
        return answer;
    }

}
