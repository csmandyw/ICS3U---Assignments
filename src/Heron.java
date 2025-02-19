//Heron's Formula - Assignment 1 (Feb.25.2025)
import java.util.Scanner;

public class Heron {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Please enter the a value");
        double a = keyboard.nextDouble();
        System.out.println("Please enter the b value");
        double b = keyboard.nextDouble();
        System.out.println("Please enter the c value");
        double c = keyboard.nextDouble();
        keyboard.close();

        double A = Math.sqrt(4 * a * a * b * b - (a * a + b * b - c * c) * (a * a + b * b - c * c))/4;
        System.out.println("The area of the triangle is: " + A);
    }
}