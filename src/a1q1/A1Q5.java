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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number bewteen 1-10");
        int num = in.nextInt();
        if (num > 0 && num < 11) {
            for (int a = 0; a < num; a++) {
                System.out.println("");
            for (int b = 0; b < num; b++) {
                System.out.print("*");
                
            }
                }
            
        } else {
            System.out.println("This is not between 1-10");
        }
    }
}
