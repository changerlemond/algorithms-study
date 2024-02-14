package programmers.level1;

import java.util.Arrays;

public class GcdLcm {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }

    public static int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }

    public static int gcd(int n, int m) {
        if (m == 0) return n;
        return gcd(m, n % m);
    }

}
