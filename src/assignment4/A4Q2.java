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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input their measurment
        System.out.println("Please enter the measurement in inches you wish to convert: ");
        int inches = input.nextInt();
        //determine the measurement in cm
        double cm = 2.54 * inches;
        {
            System.out.println(inches + " inches is the same as " + cm + " cm");

        }
    }
}
