package programmers.basic.day2;

import java.util.Scanner;

public class ConcatenateAndPrintStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        System.out.print(a + b);
        scanner.close();
    }

}