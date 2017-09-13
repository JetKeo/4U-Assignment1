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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);
        //ask user to enter words and enter exit when done
        System.out.println("Please enter words and when you are finished, enter the word: exit");
        String word = in.nextLine();
        //variable for total words
        int total = 0;

        while (word.equals("exit") == false) {
            word = in.nextLine();
            total++;

            if (word.equals("exit") != false) {
                break;
            }
        }

        System.out.println("You entered a total of " + total + " lines of words ");
    }
}
