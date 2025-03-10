
import java.util.Scanner;

public class assignment33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            int first = 0, second = 1;

            System.out.println("Fibonacci Series up to " + n + " terms:");

            
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                
                int nextTerm = first + second;
                first = second;
                second = nextTerm;
            }
        }

        scanner.close(); // Close the scanner
    }
}
