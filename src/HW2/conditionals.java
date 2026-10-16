package HW2;
import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        double greatest = a;
        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;

        System.out.println("The greatest number is: " + greatest);
        sc.close();

    }
}
