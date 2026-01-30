/*
Topic: try – catch – finally

    Write a Java program that:
Uses Scanner to take two integers from the user.
Performs division of the numbers.
Handles division by zero using try and catch.
Uses a finally block to print:
Program execution completed
Ensure the finally block executes whether an exception occurs or not.
Rules:
Must use try, catch, and finally
Must use Scanner
No if-else for zero checking
*/

import java.util.Scanner;

public class Program_50 {
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
        finally{
            System.out.println("\nProgram execution completed");
        }

        sc.close();

    }
}
