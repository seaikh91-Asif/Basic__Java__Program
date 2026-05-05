import java.util.Scanner;

public class Largest_Three_Number {
    public static void main(String[] args){

        // taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        // the main logic
        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        // for output
        System.out.println("the larget number is =  " + max);
    }
}
