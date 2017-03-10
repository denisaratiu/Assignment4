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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input their numbers
        System.out.println("Please enter in 4 numbers on separate lines: ");
        //read 4 numbers from the user on seperate lines
        //scanning their number into a variable
        int number = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        //output all of the numbers on the same line with commas in between them
        System.out.println("Your numbers were " + number + ", " + number2 + ", " + number3 + ", and " + number4);
    }
}
