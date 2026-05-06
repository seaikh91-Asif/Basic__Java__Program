import java.util.Scanner;

public class PrintNumber_from_One_to_n {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // for taking input from the user
        System.out.print("Enter the number till you want to print: ");
        int n = input.nextInt();

        // the main logic part
        // and alos the output part
        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }
}
