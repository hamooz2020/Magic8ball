package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //declare
        Scanner keyboard;
        String first, second, third, four, five, six, seven, eight, nine, ten;

        keyboard = new Scanner(System.in);

        //initialize
        int number;

        String tenResponse = "WOW! that's smart";

        String nineResponse = "You should do that!";

        String eightResponse = "Go for it!";

        String seventhResponse = "That wouldn't be a bad idea!";

        String sixthResponse = "Give it a try!";

        String fifthResponse = "That's a bad idea.";

        String fourthResponse = "Don't do it.";

        String thirdResponse = "That's not smart.";

        String secondResponse = "You shouldn't do it.";

        String firstResponse = "That's not a smart idea.";


        System.out.println("Pick a number between 1 and 100");
        number = keyboard.nextInt();

        if (number > 0 && number <= 10) {
            System.out.println(firstResponse);
        } else if (number > 11 && number <= 20) {
            System.out.println(secondResponse);
        }
        if (number > 20 && number <= 30) {
            System.out.println(thirdResponse);
        }
                    if( number> 30 && number <=40){
           System.out.println(fourthResponse);}
                       if( number> 40 && number <=50){
            System.out.println(fifthResponse);}
                            if( number> 50 && number <=60){
            System.out.println(sixthResponse);}
                                if( number> 60 && number <=70){
            System.out.println(seventhResponse);}
                                    if( number> 70 && number <=80){
            System.out.println(eightResponse);}
             if( number> 80 && number <=90) {
                                            System.out.println(nineResponse);
                                        }
                                            if( number> 90 && number <=100){
            System.out.println(tenResponse);
                                            }

    }
}
