package Lesson6;

import java.util.Scanner;

public class ArraysHomeAssignment {

    public void zero(){
        short[] a = {5,-3,8,-1,0,12,-7,4,9,-2};
        byte rep = 0;
        System.out.print("Original : ");
        for (int i : a) System.out.print(i + " ");
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0) {a[i] = 0; rep++;}
        }
        System.out.println();
        System.out.print("Modified : ");
        for (int i : a) System.out.print(i + " ");
        System.out.println();
        System.out.println("Replacement : " + rep);
    }

    public void countLar() {
        short[] a = {12,5,28,3,19,7,15,9};
        short max = a[0];
        short maxInd = 0;
        short smax = a[0];
        short sInd = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
                maxInd = (short) i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] > smax && a[i] < max) {smax = a[i]; sInd = (short) i;}
        }

        System.out.print("Arrays: ");
        for (int i : a) System.out.print( i + " ");
        System.out.println();
        System.out.println("Largest: " + max + " at index " + maxInd);
        System.out.println("Second: " + smax + " at index " + sInd);
    }


    public  void remove(){
        Scanner sc = new Scanner(System.in);
        int rem;
        int[] arr = {10,14,7,-5,8,9};
        System.out.print("Originals : ");
        for (int i : arr) System.out.print(i + " " );
        System.out.println();
        while (true){
            System.out.print("Enter a index of number that you want remove : ");
            if(!sc.hasNextInt()) {
                System.out.println("Invalid option please enter a number");
                sc.next();
                continue;
            }
                rem = sc.nextInt();
                if (rem >= 0 && rem < arr.length) break;
                System.out.println("Invalid index! Must be from 0 to " + (arr.length - 1) + ".");

        }
        for (int i = rem; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.print("Updated: ");
        for (int i = 0; i < arr.length - 1; i++) System.out.print(arr[i] + " ");
        System.out.println();
        }



    public void duplicate() {
        short[] a = {12,5,15,3,12,7,15,5,2};
        short duplicate;
        boolean found = false;
        System.out.print("Array: ");
        for(int i : a) System.out.print(i + " ");
        System.out.println();
        System.out.print("Duplicate numbers: ");
        for (int i = 0; i < a.length; i++) {
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if(a[i] == a[j]){
                    dup = true;
                    break;
                }
            }if(dup) continue;

            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    System.out.print(a[i] + " ");
                    found = true;
                    break;
                }
            }

        }
        if(!found) System.out.println("no dublicate");
    }






    void main(String[] args){
        duplicate();
    }

}
