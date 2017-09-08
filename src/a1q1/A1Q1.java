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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        //ask user for their name
        System.out.println("Enter your name");
        //creates a varible for their name
        String name = input.nextLine();
        //outputs their name saying hello
        System.out.println("Hello " + name +"!");
    }
}
