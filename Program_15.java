//Write a method addNumbers(int a, int b) that returns the sum of two numbers.
//Call this method from main() and print the result.

import java.util.Scanner;

public class Program_15 {

    static int addNumbers(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of 'a'");
        int a = sc.nextInt();

        System.out.println("Enter the value of 'b'");
        int b = sc.nextInt();

        System.out.println("Sum = " + addNumbers(a,b));
    }
}
