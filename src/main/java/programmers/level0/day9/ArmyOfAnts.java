package programmers.level0.day9;

public class ArmyOfAnts {

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        int count = 0;

        count += hp / 5;
        hp %= 5;

        count += hp / 3;
        hp %= 3;

        count += hp;

        return count;
    }

}
