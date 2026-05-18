import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int temp = number;
        int digits = 0;
        int sum = 0;

        while ( temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = number;

        while(temp > 0){
            int remainder = temp  % 10;
            sum  += Math.pow(remainder, digits);
            temp /= 10;
        }

        if(sum == originalNumber){
            System.out.print("ArmStrong Number");
        } else {
            System.out.println("Not ArmStrong Number");
        }

        scanner.close();
    }
}
