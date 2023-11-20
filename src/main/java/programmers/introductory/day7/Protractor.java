package programmers.introductory.day7;

public class Protractor {

    public static void main(String[] args) {
        System.out.println(solution(90));
    }

    public static int solution(int angle) {
        if (angle == 180) {
            return 4;
        } else if (angle > 90) {
            return 3;
        } else if (angle == 90) {
            return 2;
        } else {
            return 1;
        }
    }

}
