package HW2;
import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total purchase amount : ");
        int amt = sc.nextInt();
        System.out.println("Are you premium member : ");
        boolean memb = sc.nextBoolean();
        System.out.println("Number of Previous orders : ");
        short ord = sc.nextShort();
        System.out.println("Have are you discount coupon : ");
        boolean cop = sc.nextBoolean();
        System.out.println("Your birthday this month? : ");
        boolean bth = sc.nextBoolean();
        if(200 <= amt && memb == true &&(cop == true || bth == true)) {
            double res = amt * 0.8;
            double res1 = amt * 0.20;
            System.out.println("the initial amount : " + amt + "\nYou have 20% discount you should pay : " + res+ "\nDiscount amount : " + res1 );
        }else if (amt >= 150 && ((memb == true) || (10 <= ord))) {
            double res = amt * 0.85;
            double res1 = amt * 0.15;
            System.out.println("the initial amount : " + amt + "\nYou have 15% discount you should pay : " + res + "\nDiscount amount : " + res1);
        } else if (amt >= 100 && cop == true) {
            double res = amt * 0.9;
            double res1 = amt * 0.10;
            System.out.println("the initial amount : " + amt + "\nYou have 10% discount you should pay : " + res+ "\nDiscount amount : " + res1);
        }else if (amt <= 20 || cop == false) {
            System.out.println("No discount");
        }else {
            System.out.println("No discount, you should pay : " + amt);
        }
    }
}
