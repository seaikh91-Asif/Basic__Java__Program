import java.util.Scanner;

public class find_A_toThePower_B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int base = scanner.nextInt();
        System.out.print("enter the power: ");
        int power = scanner.nextInt();

        int ans = 1;

        while (power > 0){
            if((power & 1) == 0){
                ans *= base;
            }

            base *= base;
            power >>= 1;
        }

        System.out.println(ans);
    }
}
