import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Java Console Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = s.nextInt();

            if (choice == 5) {
                running = false;
                System.out.println("Exit");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = s.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = s.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = addition(num1, num2);
                    break;
                case 2:
                    result = subtraction(num1, num2);
                    break;
                case 3:
                    result = multiplication(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
            System.out.println("Result: " + result);
        }

        s.close();
    }
}
