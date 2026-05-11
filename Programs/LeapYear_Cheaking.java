import java.util.Scanner;

public class LeapYear_Cheaking {
    public static void main(String[] args){
        // taking input from the user
        System.out.print("enter the year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // the main logic part
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Leap Year.");
        } else {
            System.out.println(year + " Not Leap Year.");
        }
    }
}
