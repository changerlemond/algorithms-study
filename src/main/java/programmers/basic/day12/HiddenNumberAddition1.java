package programmers.basic.day12;

public class HiddenNumberAddition1 {

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        String[] array = my_string.replaceAll("[a-zA-Z]", "").split("");
        int answer = 0;
        for (String string : array) {
            answer += Integer.parseInt(string);
        }
        return answer;
    }

}
