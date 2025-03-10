import java.util.Scanner;
public class assignment13 {
    public static void main(String[]args){

        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        int sum = num1 + num2;
        int multiplication = num1 * num2;

        System.out.println("The sum is: "+ sum);
        System.out.println("Thee product is: "+ multiplication);
        scanner.close();

    }
}
