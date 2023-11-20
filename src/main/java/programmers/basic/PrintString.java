package programmers.basic;

import java.util.Scanner;

public class PrintString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int length = string.length();

        if (length >= 1 && length <= 1_000_000) {
            System.out.println(string);
        }

        scanner.close();
    }

}