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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input their names
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        //ask user about the 5 tests
        System.out.println("What was the first test out of?: ");
        int mark = input.nextInt();
        System.out.println("What mark did you get?: ");
        int given = input.nextInt();
        
      
        System.out.println("What was the first test out of?: ");
        int mark2 = input.nextInt();
        System.out.println("What mark did you get?: ");
        int given2 = input.nextInt();
        System.out.println("What was the first test out of?: ");
        int mark3 = input.nextInt();
        System.out.println("What mark did you get?: ");
        int given3 = input.nextInt();
        System.out.println("What was the first test out of?: ");
        int mark4 = input.nextInt();
        System.out.println("What mark did you get?: ");
        int given4 = input.nextInt();
        System.out.println("What was the first test out of?: ");
        int mark5 = input.nextInt();
        System.out.println("What mark did you get?: ");
        int given5 = input.nextInt();
        //test scores for "name"
        System.out.println("Test Scores for " + name);
        //calculate scores for each test
        double score = (given*100.0 / mark);
        System.out.println("Test 1: " + score +"%");
        double score2 = (given2*100.0 / mark2);
        System.out.println("Test 2: " + score2 +"%");
        double score3 = (given3*100.0 / mark3);
        System.out.println("Test 3: " + score3 +"%");
        double score4 = (given4*100.0 / mark4);
        System.out.println("Test 4: " + score4 +"%");
        double score5 = (given5*100.0 / mark5);
        System.out.println("Test 5: " + score5 +"%");
        //Average of all the tests
        double average = (score +score2 +score3 +score4 +score5)/5;
        System.out.println("Average: " + average + "%");
    }
}
