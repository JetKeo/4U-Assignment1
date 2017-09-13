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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);
        //user input between 1-10
        System.out.println("Enter a number bewteen 1-10");
        int num = in.nextInt();
        //if it is between 1-10
        if (num > 0 && num < 11) {
            //for loop to create n * in the same line
            //n - user inputed number
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("This is not between 1-10");
        }
    }
}
