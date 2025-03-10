import java.util.Scanner;

public class assignment32 {
    public static void main(String[]args){

        int number;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = scanner.nextInt();
        for (int i = number;i>0; i--){
            factorial *=i;
        }
        System.out.println(number +" factorial = "+factorial);
        scanner.close();
    }
}
