
import java.util.Scanner;

public class NumberOf_digits_In_AnyBase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
        System.out.print("enater the base value (for example binary is base 2): ");
        int base = scanner.nextInt();

        int ans = (int) (Math.log(n) / Math.log(base)) + 1;
        System.out.println(ans);

//        System.out.println(CountDigits(n, base));

    }
    // you can calculate the digits using two approch using the formulla methode and also using this function you can calculate the digits

    static int CountDigits(int n, int base){
        int count = 0;
        while(n > 0){
            int last = n & 1;
            n >>= 1;
            count++;
        }
        return count;
    }
}
