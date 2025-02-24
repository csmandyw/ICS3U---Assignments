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
        if (a < h) {
            System.out.println("No Triangle.");
        } else if (a == h) {
            System.out.println("Right Triangle.");
        } else if (a > b) {
            System.out.println("One Triangle.");
        } else {
            System.out.println("Ambiguous Case - Two Triangles");
        }
    }
}
