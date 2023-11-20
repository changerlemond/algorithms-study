package programmers.level0.day24;

public class ChickenCoupon {

    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int ten = chicken / 10;
            int rest = chicken % 10;

            chicken = ten + rest;
            answer += ten;
        }

        return answer;
    }

}
