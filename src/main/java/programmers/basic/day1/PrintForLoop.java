package programmers.basic.day1;

import java.util.Scanner;

public class PrintForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(string);
        }
    }

}
