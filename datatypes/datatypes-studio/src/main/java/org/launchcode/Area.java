package org.launchcode;

import studios.areaofacircle.Circle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;
        int negativeValueAttempts = 0;

        do {
            // Input prompt runs on first attempt only.
            if (negativeValueAttempts == 0) {
                System.out.println("Enter a radius: ");
            }

            // Validates input value to make sure it is a valid double value
            while (!input.hasNextDouble()) {
                System.out.println("That value is not a number. Try again: ");
                input.next(); // Consume the non-double input
            }

            // radius is assigned input value if above validation passes
            radius = input.nextDouble();

            // If double value is negative, prompt again for positive number and increase token count to bypass initial prompt message and use specific prompt
            if (radius < 0) {
                System.out.println("Enter a non-negative number. Try again: ");
                negativeValueAttempts++;
            }
        } while (radius < 0);

        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));

        input.close();
    }
}