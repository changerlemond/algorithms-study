package programmers.basic.day16;

public class HighlightA {

    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }

    public static String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }

}
