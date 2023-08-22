package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("We want to find the area of a rectangle.\nPlease enter the length of the rectangle:");
        System.out.print(">>> ");

        double rectangleLength = input.nextDouble();

        System.out.println("Please enter the width of the rectangle:");
        System.out.print(">>> ");

        double rectangleWidth = input.nextDouble();

        System.out.println("\nThe area of the rectangle is " + rectangleLength * rectangleWidth);

        input.close();
    }
}
