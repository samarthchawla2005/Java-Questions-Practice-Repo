/*
    Write a Java program to:

Declare a string

Print its length

Print it in uppercase

Print it in lowercase

Print the first character
*/

public class Program_16 {
    public static void main(String[] args){
        String str = "Hello Java";

        System.out.println("Length = " + str.length());
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Lowercase = " + str.toLowerCase());
        System.out.println("First Character = " + str.charAt(0));
    }
}
