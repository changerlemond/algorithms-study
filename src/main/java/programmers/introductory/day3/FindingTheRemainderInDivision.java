package programmers.introductory.day3;

public class FindingTheRemainderInDivision {

    public static void main(String[] args) {
        System.out.println(solution(5, 3));
        System.out.println(solution(3, 5));
    }

    public static int solution(int num1, int num2) {
        return num1 % num2;
    }

}
