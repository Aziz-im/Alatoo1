package HW2;
import java.util.Scanner;

public class Age_checker {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote yet.");
        }
        sc.close();

    }

}
