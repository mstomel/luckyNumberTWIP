package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("press 0 to exit, 1 to print lucky number, 2 to get a new number");
        while (true) {

            System.out.println("What would you like to do next?");
            int i = in.nextInt();
            lucky test = new lucky();

            if (i == 0){

                System.out.println("Goodbye");
                break;

            }
            else if (i == 1) {

                System.out.println("What is your name?");
                String n = in.next();
                System.out.println("Nice to meet you "+ n +"! Your lucky number is "+ test.perfectRandom() + ".");


            }
            else if (i == 2){



            }
            else {

                System.out.println("invalid input");

            }

        }
    }
}
