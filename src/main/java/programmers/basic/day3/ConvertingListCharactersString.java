package programmers.basic.day3;

public class ConvertingListCharactersString {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }

    public static String solution(String[] arr) {
        return String.join("", arr);
    }

}
