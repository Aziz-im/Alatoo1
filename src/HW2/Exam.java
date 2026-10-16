package HW2;

import java.util.Scanner;

import static java.lang.System.out;

public class Exam {

    static final int MIN_ATTENDANCE = 6;
    static final int MIN_EXAM = 17;
    static final int MIN_TOTAL = 65;

    // Спрашивает число, пока пользователь не введёт корректное значение в диапазоне
    static int readInt(Scanner sc, String prompt, int min, int max) {
        while (true) {
            out.print(prompt);
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
            } else {
                sc.next(); // пропускаем неверный ввод (не число)
            }
            out.println("Error: please enter a number from " + min + " to " + max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int atd = readInt(sc, "How many lessons out of 10 did you attend? : ", 0, 10);
        out.println(atd >= MIN_ATTENDANCE ? "Thanks" : "Not enough");

        int hw = readInt(sc, "How many points did you get for the homework? (0-60) : ", 0, 60);
        out.println("Thanks");

        int ex = readInt(sc, "How many points did you get on the exam? (0-30) : ", 0, 30);
        out.println(ex >= MIN_EXAM ? "Thanks" : "You failed");

        int res = atd + hw + ex;

        if (atd >= MIN_ATTENDANCE && ex >= MIN_EXAM && res >= MIN_TOTAL) {
            out.println("You passed. Your total score: " + res);
        } else {
            out.println("You failed. Your total score: " + res);
        }

        sc.close();
    }
}