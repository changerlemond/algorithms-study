package programmers.basic.day1;

import java.util.Scanner;

public class PrintAAndB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= -100_000 && a <= 100_000 && b >= -100_000 && b <= 100_000) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        scanner.close();
    }

}
