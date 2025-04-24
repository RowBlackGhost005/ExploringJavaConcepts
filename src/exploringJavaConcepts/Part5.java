package exploringJavaConcepts;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {
        float num1;        float num2;
        float result = 0;
        char operation;

        Scanner input = new Scanner(System.in);

        boolean systemOn = true;

        System.out.println("=== CALCULATOR ===");
        System.out.println("Enter a number: ");
        num1 = input.nextInt();
        System.out.println("Input the operation: ( * ) , ( / ) , ( + ) , ( - )");
        operation = input.next().charAt(0);
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        input.nextLine();

        if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }
        } else if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        }

        System.out.printf("%.1f %s %.1f = %.1f\n", num1, operation, num2, result);

        System.out.println("Input ( + ) or ( - ) to increase or decrease the result, any key if not");
        char inputOperation = input.nextLine().charAt(0);
        while (inputOperation == '+' || inputOperation == '-') {
            if (inputOperation == '+') {
                result++;
            } else {
                result--;
            }

            System.out.printf("%.1f\n", result);
            System.out.println("Input ( + ) or ( - ) to increase or decrease the result, any key if not");
            inputOperation = input.nextLine().charAt(0);
        }
    }
}
