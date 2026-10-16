package Lesson;

import java.util.Scanner;

public class oct {

    public static void main(String[] args){
//
//        byte i = 1;
//        while(i<=10){
//            i++;
//            System.out.println("Number : " + i);
//        }
//
//    }
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1-100: ");
        int sy = sc.nextInt();
        System.out.println("ok");

        if(sy >= 100){
            System.out.println("Your number greater than max pease enter less!!");
        } else if (sy >= 0) {
            while(sy < 100){
                System.out.println("Number: " + sy);
                sy*=10;
            }

        }else{
            System.out.println("ERROR");
        }





    }
}
