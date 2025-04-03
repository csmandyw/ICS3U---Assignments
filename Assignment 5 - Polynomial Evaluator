// Polynomial Evaluator - Assignment 5 (Mar.21.2025)
import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a polynomial (eg. f(x)=3x^3 -5x^2 +1x^4 +9x^6 +3.1x^1 +2)");
        String polynomial = keyboard.nextLine();
        System.out.println("Enter an x value");
        double x = keyboard.nextDouble();
        keyboard.close();

        polynomial = polynomial.substring(polynomial.indexOf('=') + 1); // removes "f(x)="; indexOf = "locates ="; + 1 "skips ="

        StringTokenizer function = new StringTokenizer(polynomial);
        double result = 0;

        while (function.hasMoreTokens()) {
            String term = function.nextToken();
            double coefficient = 1;
            int exponent = 0;

            if (term.contains("x")) {
                int index = term.indexOf("x"); // locates "x"

                // Take coefficient
                if (index > 0) {
                    coefficient = Double.parseDouble(term.substring(0, index));
                }

                // Take exponent
                if (term.contains("^")) {
                    exponent = Integer.parseInt(term.substring(term.indexOf("^") + 1)); // locates "^" and skips
                } else {
                    exponent = 1; // default = 1
                }

            } else {
                // Constant term
                coefficient = Double.parseDouble(term);
                exponent = 0;
            }

            // Term values + result
            result += coefficient * Math.pow(x, exponent);
        }
        System.out.println("f(" + x + ") = " + result);
    }
}
