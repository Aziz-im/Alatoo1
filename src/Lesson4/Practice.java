package Lesson4;

import java.util.Scanner;

public class Practice {


    Scanner scanner = new Scanner(System.in);

    public static void Hello(String hello){
        System.out.println(hello + ", world!");
    }

    public static int Numbers(int num ){
        for (int i = 0; i < 10; i++) {

            System.out.println("Number " + (i + 1) + ": " + num);
            num++;
        }
        return num;
    }

    public static int hi(int a, int b){
        int result;
        result = a+b;
        return result;
    }

    public static void User(String name){
        System.out.println("Hello, " + name);
    }

    public static int Even(int even){
        if (even % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
        return even;
    }





    public static int area(int side){
        return side * side;
    }

    public static int area(int width,  int height){
        return  width * height;
    }

    public static double area(double radius){
        return (radius * radius * Math.PI);
    }



    public static void main(String[] args){
        Even(10);
        System.out.println(area(15.7));

    }

}

