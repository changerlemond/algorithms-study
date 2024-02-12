package programmers.level1;

public class GetMiddleCharacter {

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        return s.length() % 2 != 0 ? "" + s.charAt(s.length() / 2) : "" + s.charAt(s.length() / 2 - 1) + s.charAt(s.length() / 2);
    }

}
