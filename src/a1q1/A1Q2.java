/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a1q1;

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
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number");
            num[i] = input.nextInt();
        }
        int mul = num[0] * num[1] * num[2];
        System.out.println("Multiplied together: " + mul);
        double sqrd = Math.pow(mul, 2);
        System.out.println("Squared:" + sqrd);
        double sqrt = Math.sqrt(mul);
        System.out.println("Square rooted: " + sqrt);
        
    }
}
