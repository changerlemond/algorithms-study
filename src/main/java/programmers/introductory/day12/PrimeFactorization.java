package programmers.introductory.day12;

import java.util.*;

public class PrimeFactorization {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));
    }

    public static int[] solution(int n) {
        LinkedHashSet<Integer> factorSet = new LinkedHashSet<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factorSet.add(i);
                n /= i;
            }
        }

        return factorSet.stream().mapToInt(Integer::intValue).toArray();
    }

}