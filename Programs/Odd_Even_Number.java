import java.util.Scanner;

public class Odd_Even_Number {
    public static void main(String[] args){
        // taking input from user
        System.out.print("enter the range: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // logic part
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0 ){
                System.out.println("ever number is = " +i );
            } else {
                System.out.println("Odd numbers is =" + i);
            }
        }
    }
}
