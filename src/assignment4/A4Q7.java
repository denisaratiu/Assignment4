/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author ratid6445
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //start on square 1
        int square = 1;
        //Ask user to input sum of dice
        while (square < 100) {
            // scanner to get user input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter sum of dice: ");
            int sum = input.nextInt();
            square = sum + square;

            if (sum >= 2 && sum <= 12 && square != 54
                    && square != 90
                    && square != 99
                    && square != 9
                    && square != 40
                    && square != 67
                    && square != 100
                    && square < 100) {
                System.out.println("You are now on square " + square);

            } else if (sum < 2 || sum > 12) {
                System.out.println("You Quit");
                break;
            }
            if (square == 54) {
                square = square - 35;
                System.out.println("You are now on square " + square);
            }
            if (square == 90) {
                square = square - 42;
                System.out.println("You are now on square " + square);
            }
            if (square == 99) {
                square = square - 22;
                System.out.println("You are now on square " + square);
            }
            if (square == 9) {
                square = square + 25;
                System.out.println("You are now on square " + square);
            }
            if (square == 40) {
                square = square + 24;
                System.out.println("You are now on square " + square);
            }
            if (square == 67) {
                square = square + 19;
                System.out.println("You are now on square " + square);
            }
            if (square > 100) {
                square = square - sum;
                System.out.println("You are now on square " + square);
            }
            if (square == 100) {
                System.out.println("You Win!");
                break;
            }
        }
    }
}