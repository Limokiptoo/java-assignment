import java.util.Scanner;
public class assignment31 {
    public static void main(String []args){
        int number;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        number = scanner.nextInt();

        for (int i = 0;i <= 50;i++){
            result= number * i;
            System.out.println(number + " * "+ i+" = "+ result );

        }

        scanner.close();
    }
}
