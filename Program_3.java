/*
 Practice Question #3 (Easy–Medium)

Write a Java program to check whether a number is even or odd using:

% modulus operator

No Scanner (use a fixed value)

Print the following formate:

Number = ?
It is EVEN / It is ODD

 */

public class Program_3 {
    public static void main(String[] args) {
        int num = 3;

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
