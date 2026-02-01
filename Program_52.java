/*
📘 Topic: Strings in Java

Question (College Assignment Style)

Write a Java program that:

Uses Scanner to take a string input from the user.

Counts and displays:

Total number of characters

Total number of vowels in the string

Display the result clearly.

Rules:

Must use String methods

Must use Scanner

Do not use arrays

Case-insensitive vowel checking (A/a, E/e, etc.)
*/

import java.util.Scanner;

public class Program_52{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sring : ");
        String s = sc.nextLine();

        System.out.println("\nThe String you entered is : "+s);

        System.out.println("\nThe length of the entered string is : " + s.length());

        int vowelCount = 0;

        for(int i = 0; i <= s.length() - 1; i++){
            char ch = s.charAt(i);
            System.out.println("\nThe character at the index " + i + " is : " + ch);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowelCount++;
            }
        }


        System.out.println("\nTotal Vowels are : " + vowelCount);
        

        sc.close();
    }
}