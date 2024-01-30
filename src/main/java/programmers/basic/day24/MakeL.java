package programmers.basic.day24;

public class MakeL {

    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }

    public static String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        char[] array = myString.toCharArray();
        for (char c : array) {
            answer.append(c < 'l' ? "l" : c);
        }
        return answer.toString();
    }

}
