package HW2;

import java.util.Scanner;

public class Start {

 /*   byte byt = 15;
    short shor = 1555;
    int ints = 116787;
    long lon = 1783782;
    String str = "Hi";
    boolean bool = false;
    char ch = '+';
    double doub = 167;
    float floa = 4.5f;*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = scan.nextInt();
        System.out.print("Choose operation: ");


        switch (scan.next()) {
            case "+":
                int res = num1 + num2;
                System.out.print(res);
                break;
            case "-":
                res = num1 - num2;
                System.out.print(res);
                break;
            case "*":
                res = num1 * num2;
                System.out.print(res);
                break;
            case "/":
                res = num1 / num2;
                System.out.print(res);
        }


    }
}
