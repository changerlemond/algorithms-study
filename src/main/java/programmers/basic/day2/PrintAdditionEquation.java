package programmers.basic.day2;

import java.util.Scanner;

public class PrintAdditionEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d + %d = %d", a, b, a + b);
        scanner.close();
    }

}
