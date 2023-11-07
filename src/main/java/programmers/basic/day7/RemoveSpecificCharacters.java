package programmers.basic.day7;

public class RemoveSpecificCharacters {

    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }

}
