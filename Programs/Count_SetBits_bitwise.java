import java.util.Scanner;

public class Count_SetBits_bitwise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }

        System.out.print(count);
    }
}
