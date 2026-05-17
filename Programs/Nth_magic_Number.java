import java.util.Scanner;

public class Nth_magic_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();

        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n >>= 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
