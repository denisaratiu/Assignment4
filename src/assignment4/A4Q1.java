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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input their name
        System.out.println("Please enter your name: ");

        //scanning their name into a variable
        String name = input.nextLine();
        //saying hello to the user
        System.out.println("Hello " + name + ". How are you today?");
    }
}
