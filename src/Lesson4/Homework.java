package Lesson4;

import java.util.Scanner;

public class Homework {
    static Scanner sc = new Scanner(System.in);

    public static int calculateGrade(int score){

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        } else if(score < 60 && score >= 0) {
            System.out.println("Grade: F");
        }else{
            System.out.println("ERROR please enter a number from 1 to 100");
        }
        return score;
    }

    public static String Pattern(int choice, int n){
        switch (choice){
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.println("*");

                    }
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j <= i; i++) {
                        return "*";
                    }
                    System.out.println();
                }
        }

        return "";
    }





     public static void main(String[] args){
//        System.out.print("Enter your score: ");
//        calculateGrade(sc.nextInt());

         System.out.println(Pattern(1, 3));
    }

}
