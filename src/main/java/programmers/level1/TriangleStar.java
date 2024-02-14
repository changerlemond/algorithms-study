package programmers.level1;

import java.util.Scanner;

public class TriangleStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.println("*".repeat(n));
        }

        scanner.close();
    }

}
