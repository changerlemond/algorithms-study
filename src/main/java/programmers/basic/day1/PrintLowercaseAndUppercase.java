package programmers.basic.day1;

import java.util.Scanner;

public class PrintLowercaseAndUppercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char element = string.charAt(i);
            if (Character.isUpperCase(element)) {
                result.append(Character.toLowerCase(element));
            } else {
                result.append(Character.toUpperCase(element));
            }
        }

        System.out.println(result);
        scanner.close();
    }

}
