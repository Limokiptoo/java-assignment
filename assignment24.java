import java.util.Scanner;
public class assignment24 {
    public static void main(String[]args){
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validoperation = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator number:");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number:");
        num2 = scanner.nextDouble();


        switch (operator){
            case'+'-> result = num1 + num2;
            case'-'-> result = num1 - num2;
            case'/'-> {
                if (num2 == 0){
                    System.out.println("cannot divide by zero");
                    validoperation = false;
                }
                else{
                    result = num1 * num2;
                }
            }
            case'*'-> result = num1 * num2;
            default -> {
                validoperation = false;
                System.out.println("invalid operator");
            }
            
        }
        if (validoperation){
            System.out.println(result);
        }
        scanner.close();
    }
}
