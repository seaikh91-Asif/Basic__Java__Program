import java.util.Scanner;

// Program to return true if the number Odd and return false if the number is even

public class Odd_Even_Bitwise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();

        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return  (n & 1) == 1;
    }
}
