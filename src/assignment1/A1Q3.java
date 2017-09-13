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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);
        //asking the price of
        System.out.println("Enter the price of:");
        System.out.println("Food, DJ, Hall rental, Decorations, Wait staff, Miscellaneous");
        //array to hold 6 numbers
        double[] price = new double[6];
        for (int i = 0; i < price.length; i++) {
        price[i] = in.nextDouble();    
        }
        //add up the arrays to get a total
        double sum = price[0] + price[1] + price[2] + price[3] + price[4] + price[5] ;
        //divide total by 35 to get how many tickets are needed to go even in money
        double ticket = sum / 35;
        //output the amount of tickets needed to sell
        System.out.println("You need to sell " + ticket + " tickets");
    }
}