package Lesson7;

import java.util.Scanner;

public class Classwork {

    static Scanner sc = new Scanner(System.in);

    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void task1() {
        System.out.println("Task 1");
        int[][] a = new int[3][3];
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = num;
                num++;
            }
        }
        printMatrix(a);
        System.out.println();
    }

    static void task2() {
        System.out.println("Task 2");
        int[][] a = {{5, 10, 15}, {20, 25, 30}};
        System.out.println("a[1][2] = " + a[1][2]);
        a[0][1] = 99;
        printMatrix(a);
        System.out.println();
    }

    static void task3() {
        System.out.println("Task 3");
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println();
    }

    static void task4() {
        System.out.println("Task 4");
        int[][] a = {{3, 8, 1}, {6, 7, 4}, {9, 2, 5}};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println();
    }

    static void task5() {
        System.out.println("Task 5");
        int[][] a = {{12, 5, 33, 8}, {-4, 19, 7, 21}, {15, 2, 40, 11}};
        int min = a[0][0];
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println();
    }

    static void task6() {
        System.out.println("Task 6");
        int[][] a = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        printMatrix(a);
        System.out.println();
    }

    static void task7() {
        System.out.println("Task 7");
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int j = 0; j < a[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < a.length; i++) {
                colSum += a[i][j];
            }
            System.out.println("Column " + j + ": " + colSum);
        }
        System.out.println();
    }

    static void task8() {
        System.out.println("Task 8");
        int[][] a = {{4, 15, 7}, {22, 3, 18}, {9, 11, 30}};
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > n) {
                    count++;
                }
            }
        }
        System.out.println("Greater than " + n + ": " + count);
        System.out.println();
    }

    static void task9() {
        System.out.println("Task 9");
        int[][] a = {{4, 15, 7}, {22, 3, 18}, {9, 11, 30}};
        System.out.print("Enter value to search: ");
        int x = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < a.length && !found; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == x) {
                    System.out.println("Found at row " + i + ", column " + j);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        System.out.println();
    }

    static void task10() {
        System.out.println("Task 10");
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        System.out.print("Diagonal: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
            sum += a[i][i];
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println();
    }

    static void task11() {
        System.out.println("Task 11");
        int[][] a = {{3, -1, 5}, {-7, 2, -4}, {6, -9, 8}};
        System.out.println("Before:");
        printMatrix(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    a[i][j] = 0;
                }
            }
        }
        System.out.println("After:");
        printMatrix(a);
        System.out.println();
    }

    static void task12() {
        System.out.println("Task 12");
        int[][] scores = {{85, 90, 78, 92}, {70, 65, 88, 74}, {95, 98, 91, 89}};
        int max = scores[0][0];
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                total += scores[i][j];
                if (scores[i][j] > max) {
                    max = scores[i][j];
                }
            }
            double avg = (double) sum / scores[i].length;
            System.out.println("Student " + (i + 1) + " average: " + avg);
        }
        double overall = (double) total / (scores.length * scores[0].length);
        System.out.println("Class max: " + max);
        System.out.println("Overall average: " + overall);
        System.out.println();



    }


    static void largest(){
        int[][] a = {
                {12, 5, 33, 8},
                {-4, 19, 7, 21},
                {15, 2, 40, 11}};
        int maxRow = a[0][0];
        int maxSum = a[0][0];
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
            if (i == 0 || rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i;
            }
        }
        System.out.println("Largest: " + maxRow + " \nSummax : " + maxSum);
    }


    static void transpose(){
        int[][] a = {
                {12, 5, 33,},
                {-4, 19, 7,}};
        int[][] b = new int[a[0].length][a.length];

        for (int i = 0; i < a[1].length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[j][i];
            }
        }
        printMatrix(a);
        System.out.println();
        printMatrix(b);

    }

    static void add() {
        int[][] a = {
                {12, 5, 33},
                {-4, 19, 7}};
        int[][] b = {
                {1, 2, 3},
                {4, 5, 6}};
        int[][] c = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(a);
        System.out.println();
        printMatrix(b);
        System.out.println();
        printMatrix(c);
    }




    static void main(String[] args){
        add();
    }
}