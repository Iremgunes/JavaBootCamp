package day01;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i<20; i++){
            System.out.println("Europe Batch 8");
        }

        System.out.println("---------------");

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number between 1-5");
        int num = input.nextInt();

        while (num<1 || num>5) {
            System.out.println("invalid entry, please re-enter");
            num = input.nextInt();

        }
        System.out.println("you have selected : " + num);

        input.close();




    }
}
