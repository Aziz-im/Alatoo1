package Lesson;

import java.util.Scanner;

public class ock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("for loop:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nwhile loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\ndo-while loop:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j += 2;
        } while (j <= n);
    }
}
