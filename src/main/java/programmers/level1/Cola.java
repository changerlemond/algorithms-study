package programmers.level1;

public class Cola {

    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
        System.out.println(solution(3, 1, 20));
    }

    public static int solution(int a, int b, int n) {
        int count = 0;
        while (n >= a) {
            count += (n / a) * b;
            n = (n / a) * b + n % a;
        }
        return count;
    }

}
