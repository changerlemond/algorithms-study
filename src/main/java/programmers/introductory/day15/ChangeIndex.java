package programmers.introductory.day15;

public class ChangeIndex {

    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("I love you", 3, 6));
    }

    public static String solution(String my_string, int num1, int num2) {
        StringBuilder result = new StringBuilder(my_string);
        char num1String = my_string.charAt(num1);
        char num2String = my_string.charAt(num2);

        result.setCharAt(num1, num2String);
        result.setCharAt(num2, num1String);
        return result.toString();
    }

}
