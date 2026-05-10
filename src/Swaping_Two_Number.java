import java.util.Scanner;

public class Swaping_Two_Number {
    public static void main(String[] args){

        // teking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number: ");
        int fn = input.nextInt();
        System.out.print("enter your second number: ");
        int sn = input.nextInt();

        // the main logic part of the program
        int temp = fn;
        fn = sn;
        sn = temp;

        // printing numbers:
        System.out.println("swapped first number = " + fn);
        System.out.println("swapped second number = " + sn);
    }
}
