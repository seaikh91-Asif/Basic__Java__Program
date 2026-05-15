import java.util.Scanner;

public class Roots_of_quadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation format: ax^2 + bx + c = 0");


        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for 1c: ");
        double c = scanner.nextDouble();


        double d = (b * b) - (4 * a * c);


        if (d > 0) {
            // D > 0 hole duti alada real root thakbe
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("\nRoots are real and distinct.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        else if (d == 0) {

            double root = -b / (2 * a);
            System.out.println("\nRootr are real and equal (soman).");
            System.out.println("Root 1 = Root 2 = " + root);
        }
        else {

            System.out.println("\nReal Roots are doesn't exist (Roots are complex/imaginary).");
        }

        scanner.close();
    }
}
