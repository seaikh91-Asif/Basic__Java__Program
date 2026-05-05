import java.util.Scanner;

public class Swaping_Two_Number {
    public static void main(String[] args){

        // taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int first = input.nextInt();
        System.out.println("Enter Second Number: ");
        int second = input.nextInt();

        // the main logic part
        int temp = first;
        first = second;
        second = temp;

        //the output part
        System.out.println("Swapped firstNumber = " + first);
        System.out.println("Swapped secondNumber = " + second);
    }
}
