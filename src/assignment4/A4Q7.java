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
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        //Ask user to input sum of dice
        System.out.println("Enter sum of dice: ");
        int sum = input.nextInt();
        System.out.println("You are now on square " + sum);
    }
}