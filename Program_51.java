/*
    Question (Assignment-style):
Write a Java program that:
Uses Scanner to take two integer inputs from the user.
Performs division of the first number by the second.
Handles the following exceptions separately:
Division by zero
Invalid input (non-integer input)
Displays different messages for each exception.
Uses a finally block to display:
End of program
Rules:
Must use multiple catch blocks
Must use Scanner
No if-else validation
Handle exceptions only via try-catch

🧠 Hint (just one):
One exception is related to math, the other to input type.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter number 1 : ");
            int num_1 = sc.nextInt();

            System.out.print("Enter number 2 : ");
            int num_2 = sc.nextInt();

            System.out.println();

            int div = num_1 / num_2;
            System.out.println(num_1 + "/" + num_2 + " = " + div);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (InputMismatchException e) {
            System.out.println("Provide an integer input");
        } finally {
            System.out.println("\nEnd of program");
        }

        sc.close();

    }
}
