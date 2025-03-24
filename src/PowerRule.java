// Power Rule - Assignment 6 (Mar.26.2025)
import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String firstDerivative = "f'(x) =";
        String secondDerivative = "f''(x) =";

        System.out.println("Please enter your coefficients, separated by a space.");
        String coefficients = keyboard.nextLine();
        System.out.println("Please enter your exponents, separated by a space.");
        String exponents = keyboard.nextLine();
        keyboard.close();

        String[] coeffs = coefficients.split(" ");
        String[] expos = exponents.split(" ");

        for (int i = 0; i < coeffs.length; i++) {
            double coeff = Double.parseDouble(coeffs[i]);
            int exp = Integer.parseInt(expos[i]);

            // first derivative
            if (coeff != 0) {
                double firstCoeff = coeff * exp;
                int firstExpo = exp - 1;
                if (firstExpo >= 0) {
                    firstDerivative += (firstCoeff > 0 ? "+" : "") + firstCoeff + "x^" + firstExpo + " ";
                }
            }
            // second derivative
            if (coeff != 0) {
                double secondCoeff = coeff * exp * (exp - 1);
                int secondExpo = exp - 2;
                if (secondExpo >= 0) {
                    secondDerivative += (secondCoeff > 0 ? "+" : "") + secondCoeff + "x^" + secondExpo + " ";
                }
            }
            if (coeff == (int)coeff) {
                System.out.println((int)coeff);
            }
        }
        System.out.println("Your first derivative is: " + firstDerivative);
        System.out.println("Your second derivative is: " + secondDerivative);
    }
}