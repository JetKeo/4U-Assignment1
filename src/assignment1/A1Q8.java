/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author jetkeo
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);
        //varibles
        int years = 0;
        double bal = 0;
        //ask the user for values
        System.out.println("Enter the inital amount in the account");
        double i = in.nextDouble();

        System.out.println("Enter the annual decimal percentage rate");
        double r = in.nextDouble();
        //loop until the balance is doubled
        bal = i;
        while (bal <= i * 2) {
            bal = (1 + r) * bal;
            years++;
        }
        //output the years
        System.out.println("It will take " + years + " years for the money to double");
    }

}
