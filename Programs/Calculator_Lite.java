import java.util.Scanner;

public class Calculator_Lite {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int sum, sub, mul, div;

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();


        scanner.nextLine();

        System.out.print("Enter which operation you want to perform (addition, subtraction, multiplication, division): ");
        String opt = scanner.nextLine();



        if (opt.trim().equalsIgnoreCase("addition")) {
            sum = a + b;
            System.out.println("The addition is = " + sum);

        } else if (opt.trim().equalsIgnoreCase("subtraction")) {
            sub = a - b;
            System.out.println("The subtraction is = " + sub);

        } else if (opt.trim().equalsIgnoreCase("multiplication")) {
            mul = a * b;
            System.out.println("The multiplication is = " + mul);

        } else if (opt.trim().equalsIgnoreCase("division")) {
            if (b != 0) {
                div = a / b;
                System.out.println("The division is = " + div);
            } else {
                System.out.println("Error: Cannot divide by zero!");
            }

        } else {
            System.out.println("Invalid operation! Please type addition, subtraction, multiplication, or division.");
        }


        scanner.close();
    }
}