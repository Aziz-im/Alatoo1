package Lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork1 {
    static Scanner sc = new Scanner(System.in);

    static void task1(){
        int[] a = {4,7,9,2,5,8,1,6};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            i++;
        }
    }

    static void task2() {
        int[] a = {3,-2,0,7,-4,5, -6, 6, 8};
        short sum = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0 ){
                sum += a[i];
            }
        }
        System.out.println("Sum : " + sum);
    }

    static void task3(){
        int[] a = new int[8];
        byte count = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] >=10 && a[i] <= 20) count++;
        }
        System.out.println("Count: " + count);
    }

    static void task4(){
        short[] a = {8,3,5,3,9,2,6};
        short smax = a[0];
        short sInd = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i] < smax) {smax = a[i]; sInd = (short) i;}
        }
        System.out.println("Min : " + smax);
        System.out.println("In index : " + sInd);
    }

    static void  task5(){
        short[] a = {1,4,-2,0,8,3};

        for (int i = 0; i < a.length; i++) {
            a[i] += 5;
        }
        System.out.println(Arrays.toString(a));
    }

    static void task6(){
        short[] a = {6,9,3,8,6,10,2,7};
        byte count = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > a[0]) count++;
        }
        System.out.println("Count : " + count);

    }

    static void task7() {
        short[] a = {3,8,5,2,7,4,9,6};
        System.out.println("Even: ");
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 ==0) System.out.print(a[i] + " ");
        }
    }

    static void task8() {
        short[] a = {18,20,22,19,21,24,16};
        short sum = 0;
        double average;
        byte count = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        average = (short) (sum / 7);
        for (int i = 0; i < a.length; i++) {
            if(a[i] > average) count++;
        }
        System.out.println("Average : " + average + " above: " + count);
    }

    static void task9() {
        short[][] a = {{1,2,3},{4,5,6}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void task10() {
        short[][] a =  {{0,2,3},{4,0,6},{0,8,0}};
        byte count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == 0) count ++;
            }
        }
        System.out.println("Zeros: " + count);
    }

    void main(String[] args){
        task3();
    }
}
