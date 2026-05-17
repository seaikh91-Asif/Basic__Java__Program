import java.net.HttpRetryException;
import java.util.Scanner;

public class PowerOfTwoOrNot_IN_Bitwaise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
