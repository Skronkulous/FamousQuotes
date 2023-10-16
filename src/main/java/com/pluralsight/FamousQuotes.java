package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static String[] quotes = {"Life is 10% what happens to you, and 90% how you react to it.", "Ever tried. Ever failed. No Matter. Try Again. Fail Again. Fail Better.", "Quality is not an act, it is a habit.", "With the new day comes new strength and new thoughts.", "If you're going through hell, keep going.", "It always seems impossible until it's done.", "It does not matter how slowly you go as you do not stop.", "The secret of getting ahead is getting started.", "All our dreams can come true, if we have the courage to pursue them.", "It's hard to beat a person who never gives up."};
    public static void main(String[] args) {
        quoteDisplay();
    }
    public static void quoteDisplay(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please choose a quote (1 - 10): ");
            int choice = (scan.nextInt() - 1);
            System.out.println("Quote #" + (choice + 1) + ": " + quotes[choice] + "\n");
            anotherDisplay();
        }
        catch (Exception e){
            System.out.println("Your number was out of range, please try again! \n");
            quoteDisplay();
        }
    }
    public static void anotherDisplay(){
        Scanner scan = new Scanner(System.in);
            System.out.print("Would you like to display another quote? \n\t1: Yes\n\t2: No\n(1 or 2):");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Would you like to display a random quote? \n\t1: Yes\n\t2: No\n(1 or 2): ");
                    choice = scan.nextInt();
                    switch(choice){
                        case 1:
                            randomDisplay();
                        case 2:
                            quoteDisplay();
                        default:
                            System.out.println("Your number was out of range, please try again! \n");
                            anotherDisplay();
                    }
                    quoteDisplay();
                case 2:
                    break;
                default:
                    System.out.println("Your number was out of range, please try again! \n");
                    anotherDisplay();

            }
    }
    public static void randomDisplay(){
        final Random rndm = new Random();
        Integer rndmInt = rndm.nextInt(1,11);
        System.out.println("Random Quote (#" + rndmInt +"): " + quotes[rndmInt] +"\n");
        anotherDisplay();
    }
}