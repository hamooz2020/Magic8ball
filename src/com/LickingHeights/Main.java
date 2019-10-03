package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //declare
        Scanner keyboard;
        String first,second,third,four,five,six,seven,eight,nine,ten;

        keyboard = new Scanner(System.in);

        //initialize
        int number;

        System.out.println("WOW! that's smart");

        System.out.println("You should do that!");

        System.out.println("Go for it!");

        System.out.println("That wouldn't be a bad idea!");

        System.out.println("Give it a try!");

        System.out.println("That's a bad idea.");

        System.out.println("Don't do it.");

        String thirdResponse = "That's not smart.";

        String secondResponse = "You shouldn't do it.";

        String firstResponse = "That's not a smart idea.";


        System.out.println("Pick a number between 1 and 100");
        number = keyboard.nextInt();

        if( number> 0 && number <=10) {
            System.out.println(firstResponse);
        }

        if( number> 0 && number <=10)

            if( number> 11 && number <=20)

                if( number> 21 && number <=30)

                    if( number> 31 && number <=40)

                        if( number> 41 && number <=50)

                            if( number> 51 && number <=60)

                                if( number> 61 && number <=70)

                                    if( number> 71 && number <=80)

                                        if( number> 81 && number <=90)

                                            if( number> 91 && number <=100)

    }
}
