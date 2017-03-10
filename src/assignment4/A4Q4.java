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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input their costs
        System.out.println("How much does the food for prom cost? : ");
        int cost = input.nextInt();
        System.out.println("How much does the DJ cost? : ");
        int cost2 = input.nextInt();
        System.out.println("How much does it cost to rent the hall? : ");
        int cost3 = input.nextInt();
        System.out.println("How much does decorations cost? : ");
        int cost4 = input.nextInt();
        System.out.println("How much does it cost for staff? : ");
        int cost5 = input.nextInt();
        System.out.println("How much for miscellaneous costs? : ");
        int cost6 = input.nextInt();

        //calculate costs for 
        int total = cost + cost2 + cost3 + cost4 + cost5 + cost6;
        System.out.println("The total cost is " + total + ".");
        int tickets = total / 35;
        System.out.println("You will need to sell " + tickets + " tickets to break even.");
    }
}
