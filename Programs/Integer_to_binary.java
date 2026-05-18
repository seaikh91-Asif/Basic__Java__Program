import java.util.Scanner;

public class Integer_to_binary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter integer value: ");
        int n = scanner.nextInt();

        String binary = (Integer.toBinaryString(n));

        System.out.print(binary);
    }
}
