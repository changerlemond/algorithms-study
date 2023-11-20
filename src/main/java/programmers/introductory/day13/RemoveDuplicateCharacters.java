package programmers.introductory.day13;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }

    public static String solution(String my_string) {
        return my_string
                .codePoints()
                .distinct()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
