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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // user input
        Scanner input = new Scanner(System.in);
        //array to hold 3 numbers
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number");
            num[i] = input.nextInt();
        }
        //multiplying a 3 numbers
        int mul = num[0] * num[1] * num[2];
        System.out.println("Multiplied together: " + mul);
        //sqaring the mulitplied number
        double sqrd = Math.pow(mul, 2);
        System.out.println("Squared:" + sqrd);
        //square rooting the multiplied number
        double sqrt = Math.sqrt(mul);
        System.out.println("Square rooted: " + sqrt);
        
    }
}
