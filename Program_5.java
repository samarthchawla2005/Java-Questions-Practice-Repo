/* Practice Question #5 (Medium–Tricky)
Write a Java program to check whether a number is positive, negative, or zero.
Requirements:

Use a fixed integer (no Scanner).

Use if – else if – else structure.

Output example:
Number = -8
It is NEGATIVE

*/

public class Program_5 {
    public static void main(String[] args) {
        int Num = -8;

        if (Num > 0) {
            System.out.println("It is POSITIVE");
        } else if (Num < 0) {
            System.out.println("It is NEGATIVE");
        } else {
            System.out.println("It is Zero");
        }
    }
}
