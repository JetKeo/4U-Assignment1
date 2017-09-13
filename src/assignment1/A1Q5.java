/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author keonj9218
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);
        //ask user for number between 1-10
        System.out.println("Enter a number bewteen 1-10");
        int num = in.nextInt();
        //if num is between 1-10
        if (num > 0 && num < 11) {
            //for loop to go to the next line as many times as the user inputed
            for (int a = 0; a < num; a++) {
                System.out.println("");
                //for loop to create n * in the same line
                //n - user inputed number
                for (int b = 0; b < num; b++) {
                    System.out.print("*");

                }
            }

        } else {
            System.out.println("This is not between 1-10");
        }
    }
}
