// Power Rule - Assignment 6 (Mar.26.2025)
import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Please enter your coefficients, seperated by a space.");
        String coefficients = keyboard.nextLine();
        System.out.println("Please enter your exponents, seperated by a space.");
        String exponents = keyboard.nextLine();
        keyboard.close();

        String[] coeffs = coefficients.split(" ");
        String[] expos = exponents.split(" ");
        
        
    }
}
