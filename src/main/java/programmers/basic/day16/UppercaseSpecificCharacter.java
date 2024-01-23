package programmers.basic.day16;

public class UppercaseSpecificCharacter {

    public static void main(String[] args) {
        System.out.println(solution("programmers", "p"));
        System.out.println(solution("lowercase", "x"));
    }

    public static String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

}
