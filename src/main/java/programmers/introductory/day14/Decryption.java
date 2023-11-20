package programmers.introductory.day14;

public class Decryption {

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

    public static String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();
        for (int i = code; i <= cipher.length(); i += code) {
            result.append(cipher.charAt(i - 1));
        }
        return result.toString();
    }

}
