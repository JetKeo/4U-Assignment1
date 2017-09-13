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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        //array to hold 10 words
        String[] words = new String[10];
        //ask user for 10 words
        System.out.println("Enter 10 words");
        for (int i = 0; i < 10; i++) {
            words[i] = in.nextLine();
        }
        double avg = 0.0;
        double sum = 0.0;
        //for loop till i 
        for (int i = 0; i < 10; i++) {
            //add up the length of the words
            sum = words[i].length() + sum;
        }
        //get the average of the words
        avg = sum / 10;
        //output the average length of the words
        System.out.println(avg + " is average length of all the words" );

    }
}
