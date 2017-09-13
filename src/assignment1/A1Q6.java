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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);
        //ask the user for a number
        System.out.println("Enter a number between 50 and 100 to stop at:");
        int num = in.nextInt();
        //starting number
        int hun = 100;
        //if number is between 50-100 run
        if (num >= 50 && num <= 100) {
            //output the countdown from 100 subtracting 5 each time
            System.out.println(hun);
            while (num < hun) {
                hun = hun - 5;
                System.out.println(hun);
                //if the the number is less than the inputed number, break
                if (hun - 5 < num) {
                    break;
                }
            }
        }
    }

}
