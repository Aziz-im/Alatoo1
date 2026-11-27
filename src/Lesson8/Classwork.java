package Lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork {
    static Scanner sc = new Scanner(System.in);

    static void task11() {
            int sum = 0;

            short[] a = {2,4,6,8,1,3,5,7};

            for (int i = 1; i < a.length; i++) {
                sum+=a[i];
                i++;
            }
        System.out.println("Sum: " + sum);
    }

    static void task12(){
        int[] a = new int[10];
        byte count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 3 == 0) count++;
        }
        System.out.println("Count: " + count);
    }

    static void task13() {
        short[] a = {2,4,6,8,1,3,5,7};
        boolean found = false;

        System.out.print("Enter a number that you want to find : ");
        short fo = sc.nextShort();
        for (int i = 0; i < a.length; i++) {
            if(fo == a[i]) {System.out.println("Find in index: " + i); found = true;}
        }

        if(!found) System.out.println("NOT FOUND");

    }

    static void task14() {
        short[] a = {2,4,6,8,1,3,5,7};


        System.out.print("Enter a limit : ");
        short fo = sc.nextShort();
        for (int i = 0; i < a.length; i++) {
            if(fo < a[i]) {a[i] = fo;}
        }
        System.out.println(Arrays.toString(a));
    }

    static void task15() {
        int[] a = {10, 20, 15, 5, 25};
        int total = 0;

        for (int p : a) {
            total += p;
        }

        double average = (double) total / a.length;

        System.out.println("Total: " + total + "; average: " + average);
    }

    static void task16(){
        int[] a = new int[6];
        int pass = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter score " + (i + 1) + " : ");
            int s = sc.nextInt();

            while (s < 0 || s > 100) {
                System.out.print("Invalid. Enter 0-100: ");
                s = sc.nextInt();
            }

            a[i] = s;
        }

        for (int s : a) {
            if (s >= 60) {
                pass++;
            }
        }

        System.out.println("Passed: " + pass);
        sc.close();
    }

    static void task17(){
        int[] a = {1, 3, 5, 2, 4, 6};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * 2;
        }

        System.out.println("Original: " + Arrays.toString(a));
        System.out.println("Doubled:  " + Arrays.toString(b));
    }

    static void task18() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 8, 3, 9, 5, 0};
        int am = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                am++;
            }
        }

        System.out.println("Matches: " + am);
    }

    static void task19(){
        short[][] a =  {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + sum);

    }}


    static void task20() {
        short[][] a = {{2, 8, 3, 1}, {9, 4, 6, 5}, {7, 0, 11, 2}};

        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];                // первый элемент строки
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println("Row " + (i+1) + " : " + max);
        }


    }




    void main(String[] args){
        task20();
    }
}