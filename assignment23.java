import java.util.Scanner;
public class assignment23 {
    public static void main(String[]args){

        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year:");
        year = scanner.nextInt();

        if (year % 4 == 0 || (year % 100 ==0 && year % 400 == 0)){
            System.out.println( year+ " is a leap year.");
        }
        else {
            System.out.println(year+ " is NOT a leap year.");
        }

        scanner.close();
    }
}
