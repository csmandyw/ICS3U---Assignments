// Boolean Test - Assignment 2 (Mar.7.2025)
import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an A value (true/false): ");
        boolean A = keyboard.nextBoolean();
        System.out.println("Please enter a B value (true/false): ");
        boolean B = keyboard.nextBoolean();
        System.out.println("Please enter an C value (true/false): ");
        boolean C = keyboard.nextBoolean();
        System.out.println("Please enter an D value (true/false): ");
        boolean D = keyboard.nextBoolean();
        keyboard.close();

        boolean output = (B && !D) || (!B && !C && D) || (!A && !B && !C) || (A && C && !D);
        System.out.println("Your output is: " + output);
    }
}