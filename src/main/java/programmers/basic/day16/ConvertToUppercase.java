package programmers.basic.day16;

public class ConvertToUppercase {

    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("AAA"));
    }

    public static String solution(String myString) {
        return myString.toUpperCase();
    }

}
