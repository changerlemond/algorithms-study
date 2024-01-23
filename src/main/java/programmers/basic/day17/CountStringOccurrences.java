package programmers.basic.day17;

public class CountStringOccurrences {

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("aaaa", "aa"));
    }

    public static int solution(String myString, String pat) {
        int count = 0;
        int index = myString.indexOf(pat);

        while (index != -1) {
            count++;
            index = myString.indexOf(pat, index + 1);
        }

        return count;
    }

}
