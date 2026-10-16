package Lesson1;

import java.util.Scanner;
import java.util.Random;

public class Randomm {

    void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int ran = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;


        System.out.println("Загадал число а ты попробуй угадать! ");

        do{
            guess = sc.nextInt();
            attempts ++;
            if(guess < ran){
                System.out.println("Number greater! ");
            } else if (guess >ran) {
                System.out.println("Number less! ");
            } else if (guess == ran) {
                System.out.println("You win!!!!!! \n" + "За столько попыток: " + attempts);

            }
        }while (guess != ran);




    }

}
