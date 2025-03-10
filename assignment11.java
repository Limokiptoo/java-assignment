import java.util.Scanner;
public class assignment11 {
    public static void main(String[]args){
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Hello "+ name + " you are "+ age+" years old!");

        scanner.close();
    }
}

