// Ambiguous Case - Assignment 3 (Mar.7.2025)
import java.util.Scanner;

public class AmbiguousCase {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the value for angle A");
        double angleA = keyboard.nextDouble();
        System.out.println("Please enter the value for side a");
        double a = keyboard.nextDouble();
        System.out.println("Please enter the value for side b");
        double b = keyboard.nextDouble();
        keyboard.close();

        double h = b * Math.sin(Math.toRadians(angleA));

        // acute triangle
        if (angleA < 90) {
            if (a < h) {
                System.out.println("No Triangle.");
            } else if (a == h) {
                System.out.println("Right Angle Triangle.");
            } else if (a > b) {
                System.out.println("One Triangle.");
            } else if (h < a && a < b) {
                System.out.println("Two triangles; you have an ambiguous case.");
            }
        }
        // obtuse angle
        else if (angleA > 90) {
            if (a < b || a == h) {
                System.out.println("No Triangle.");
            } else if (a > b) {
                System.out.println("One Triangle.");
            }
        }
    }
}
