package programmers.basic.day16;

public class ConvertToLowercase {

    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("aaa"));
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }

}
