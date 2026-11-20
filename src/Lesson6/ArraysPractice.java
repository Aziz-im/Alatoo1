package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    public void count(){
        int[] a = {1,2,3,-3,-2,-1,0,0,-4,-5};
        byte pos = 0;
        byte neg = 0;
        byte zer = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0) {pos++;}
            else if(a[i] < 0) {neg++;}
            else{zer++;}
        }

        System.out.println("Positive : " + pos);
        System.out.println("Negative : " + neg);
        System.out.println("Zero : " + zer);
    }


    public void countLar() {
        short[] a = {12,5,28,3,19,7,15,9};
        short max = a[0];
        short maxInd = 0;
        short min = a[0];
        short minInd = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
                maxInd = (short) i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
                minInd = (short)i;
            }
        }
        System.out.print("Arrays: ");
        for (int i : a) System.out.print( i + " ");
        System.out.println();
        System.out.println("Largest: " + max + " at index " + maxInd);
        System.out.println("Smallest: " + min + " at index " + minInd);
    }


    public void average(){
        short[] a = {10,20,30,40,50,60};
        byte greater = 0;
        short overall = 0;
        double average;
        byte index = 0;

        for (int i = 0; i < a.length; i++) {
            overall += a[i];
            index ++;
        }
        average = (short) (overall / (short)index);

        for (int i = 0; i < a.length; i++) {
            if(a[i] > average) greater++;

        }
        System.out.print("Array : ");
        for (int i : a) System.out.print(i + " ");
        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Greater than average : " + greater);
    }

    public void reverse(){
        int[] w = {1, 2, 3, 4, 5};
        System.out.print("Original: ");
        for (int i : w) System.out.print(i + " ");
        for (int i = 0; i < w.length / 2; i++) {
            int t = w[i];
            w[i] = w[w.length - 1 - i];
            w[w.length - 1 - i] = t;
        }
        System.out.println();
        System.out.print("Reverse: ");
        for (int i : w) System.out.print(i + " ");
    }

    public static void studentScores() {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input! Enter a number.");
                    sc.next();
                    continue;
                }

                int score = sc.nextInt();
                if (score >= 0 && score <= 100) {
                    scores[i] = score;
                    break;
                }
                System.out.println("Invalid score! 0 to 100.");
            }
        }
        int passed = 0, failed = 0, sum = 0;
        for (int s : scores) {
            if (s >= 60) passed++;
            else failed++;
            sum += s;
        }

        System.out.print("Scores: ");
        for (int s : scores) System.out.print(s + " ");
        System.out.println();

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + (double) sum / scores.length);
    }


    void main(String[] args){
        studentScores();
    }

}
