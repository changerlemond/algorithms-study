package programmers.introductory.day16;

public class Letter {

    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    public static int solution(String message) {
        return message.length() * 2;
    }

}
