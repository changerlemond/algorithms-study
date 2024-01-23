package programmers.basic.day17;

public class FindLongestEndingSubstring {

    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }

    public static String solution(String myString, String pat) {
        int endIndex = myString.lastIndexOf(pat) + pat.length();
        return myString.substring(0, endIndex);
    }

}
