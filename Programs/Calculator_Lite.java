import java.util.Scanner;

public class Calculator_Lite {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ভেরিয়েবল ডিক্লেয়ার করা হলো
        int sum, sub, mul, div;

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Buffer clear করার জন্য ঠিক এইখানে nextLine() দিতে হবে
        scanner.nextLine();

        System.out.print("Enter which operation you want to perform (addition, subtraction, multiplication, division): ");
        String opt = scanner.nextLine();

        // if-else if লজিক দিয়ে অপারেশনগুলো চেক করা হচ্ছে
        // .trim() ব্যবহার করা হয়েছে যাতে অতিরিক্ত স্পেস কেটে যায়
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

        // স্ক্যানার ক্লোজ করা ভালো প্র্যাকটিস
        scanner.close();
    }
}