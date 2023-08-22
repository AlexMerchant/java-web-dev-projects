package org.launchcode;

import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name? ");
        System.out.print(">>> ");

        String name = input.nextLine();

        System.out.println("\nHello, " + name + "!");
    }
}
