package programmers.basic.day18;

public class FindReplaceStrings {

    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
    }

    public static int solution(String myString, String pat) {
        String replace = myString.replace('A', '_').replace('B', 'A').replace('_', 'B');
        return replace.contains(pat) ? 1 : 0;
    }

}
