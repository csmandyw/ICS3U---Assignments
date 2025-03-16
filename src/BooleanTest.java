// Boolean Test - Assignment 2 (Mar.7.2025)
import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an A value (true/false): ");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter a B value (true/false): ");
        boolean b = keyboard.nextBoolean();
        System.out.println("Please enter an C value (true/false): ");
        boolean c = keyboard.nextBoolean();
        System.out.println("Please enter an D value (true/false): ");
        boolean d = keyboard.nextBoolean();
        keyboard.close();

        boolean output = (b && !d) || (!b && !c && d) || (!a && !b && !c) || (a && c && !d);
        System.out.println("Your output is: " + output);
    }
}
