package programmers.level0.day5;

public class PrintAge {

    public static void main(String[] args) {
        System.out.println(solution(40));
        System.out.println(solution(23));
    }

    public static int solution(int age) {
        return 2022 - age + 1;
    }

}
