package Lesson;

import java.util.Scanner;

public class ocp {


    public static void main(String[] args){

//        System.out.println("Enter number: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//
//        System.out.println("for loop:");
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//
//        System.out.println("\nwhile loop:");
//        int i = 1;
//        while (i <= n) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }
//
//        System.out.println("\ndo-while loop:");
//        int j = 1;
//        do {
//            if (j % 2 == 0) {
//                System.out.print(j + " ");
//            }
//            j++;
//        } while (j <= n);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        short i = sc.nextShort();

            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Its not fizz or buzz" + i);
            }




    }

}
