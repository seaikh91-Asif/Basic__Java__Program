import java.util.Scanner;

public class Counting_Occurence {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter the number: ");
        int fn = input.nextInt();

        System.out.println("Enter the number that you want cheack Occurence: ");
        int sn = input.nextInt();

        while (fn > 0) {
            int rem = fn % 10;
            if(rem == sn){
                count++;
            }
            fn /= 10;
        }

        System.out.println(count);
    }
}
