package programmers.level0.day17;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }

    public static int solution(int n) {
        return String.valueOf(n).chars().map(Character::getNumericValue).sum();
    }

}
