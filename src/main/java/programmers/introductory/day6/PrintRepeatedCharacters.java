package programmers.introductory.day6;

public class PrintRepeatedCharacters {

    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            stringBuilder.append(String.valueOf(ch).repeat(Math.max(0, n)));
        }
        return stringBuilder.toString();
    }

}
