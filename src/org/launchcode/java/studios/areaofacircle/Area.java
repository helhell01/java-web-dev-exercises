package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        //first part:
//        double area;
//        double radius;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//        radius = input.nextDouble();
//        input.close();
//        area = 3.14 * radius * radius;
//        System.out.println("The area of a circle of radius " + radius + " is: " + area + "!");


        ///Second part update (last years code):
        double area;
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        if (!input.hasNextDouble()) {
            System.out.println("Radius must be a number.");
            System.out.println("Enter a radius: ");
            input.nextLine();
        }
        radius = input.nextDouble();
        while (radius < 0) {
            System.out.println("Radius must be nonnegative.");
            System.out.print("Enter a radius: ");
            if (!input.hasNextDouble()) {
                System.out.println("Radius must be a number.");
                System.out.println("Enter a radius: ");
            }
            radius = input.nextDouble();
        }
        input.close();

        area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area + "!");
    }
}
