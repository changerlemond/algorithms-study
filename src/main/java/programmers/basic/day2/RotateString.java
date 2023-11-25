package programmers.basic.day2;

import java.util.Scanner;

public class RotateString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        a.chars().forEach(ch -> System.out.println((char) ch));

        scanner.close();
    }

}
