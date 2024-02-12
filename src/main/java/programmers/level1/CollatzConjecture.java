package programmers.level1;

public class CollatzConjecture {

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int count = 0;
        long n = num;
        while (n != 1) {
            if (count >= 500) {
                break;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
        }
        return count == 500 ? -1 : count;
    }

}
