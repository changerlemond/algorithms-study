package programmers.basic.day21;

public class StringIntSum {

    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }

    public static int solution(String num_str) {
        char[] array = num_str.toCharArray();
        int result = 0;
        for (char c : array) {
            result += Integer.parseInt(String.valueOf(c));
        }
        return result;
    }

}
