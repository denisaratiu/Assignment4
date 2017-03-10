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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        //Ask user to input speed information 
        System.out.println("Enter the speed limit: ");
        int limit = input.nextInt();
        System.out.println("Enter the recorded speed of the car: ");
        int speed = input.nextInt();
        //use speed to calculate if they are speeding
        int speeding = speed - limit;
        if (speeding <= 0) {
            System.out.println("Congradulations, you are within the speed limit!");
        }
        if (speeding >= 1 && speeding <= 20) {
            System.out.println("You are speeding and your fine is $100");
        }
        if (speeding >= 21 && speeding <= 30) {
            System.out.println("You are speeding and your fine is $270");
        }
        if (speeding >= 31) {
            System.out.println("You are speeding and your fine is $500");
        }
    }
}
