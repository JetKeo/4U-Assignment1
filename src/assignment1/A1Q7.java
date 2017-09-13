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
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //starting year
        int year = 1999;
        //current population
        double pop = 6000000000.0;
        //while population is less than 10 billion loop
        while (pop < 10000000000.0) {
            //rate of population growth
            pop = pop * 1.014;
            // add a year 
            year++;
        }
        //output year
        System.out.println("The year the population will exceed 10 billion is the year " + year);
    }

}
