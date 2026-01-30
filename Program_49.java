/*
Write a Java program that:
Uses Scanner to take two integers from the user.
Performs division of the first number by the second number.
Handles the case where the user enters 0 as the divisor using exception handling.
If an exception occurs, display a meaningful message like:
Division by zero is not allowed
If no exception occurs, display the result.
Rules (important):
Must use try and catch
Must use Scanner
Do not use if (b == 0)
👉 handle it only using exception handling
💡 Hint (small one):
The exception you’ll need is related to division.
*/

import java.util.Scanner;

public class Program_49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num_1 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int num_2 = sc.nextInt();

        
        System.out.println();
        
        try{
            int div = num_1/num_2;
            System.out.println(num_1 + "/" + num_2 + " = " + div);
        }
        catch(ArithmeticException  e){
            System.out.println("The exception occured is : " + e);
        }

        // System.out.println("Number 1 / Number 2 = " + div);

        sc.close();
    }
}
