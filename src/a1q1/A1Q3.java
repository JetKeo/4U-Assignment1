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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of:");
        System.out.println("Food, DJ, Hall rental, Decorations, Wait staff, Miscellaneous");
        double[] price = new double[6];
        for (int i = 0; i < price.length; i++) {
        price[i] = in.nextDouble();    
        }
        double sum = price[0] + price[1] + price[2] + price[3] + price[4] + price[5] ;
        double ticket = sum / 35;
        System.out.println("You need to sell " + ticket + " tickets");
    }
}