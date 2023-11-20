package programmers.introductory.day6;

import java.util.Scanner;

public class PrintRightAngledTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }

}
