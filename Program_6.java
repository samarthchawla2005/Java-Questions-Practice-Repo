/*
    Write a Java program to check whether a year is a leap year or not.

🚀 Conditions for a leap year:

A year is a leap year if:

It is divisible by 4

BUT if it is divisible by 100, then it must also be divisible by 400

Examples:

2020 → leap year

1900 → NOT a leap year

2000 → leap year

Program Rules:

Use a fixed integer value for the year

Use if–else–if

Print in this format:

Year = 2024
It IS a leap year
 
 */

public class Program_6 {
    public static void main(String[] args) {
        int year = 2024;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if(year % 400 == 0){
                    System.out.println("It is a leap year");
                }
                else{
                    System.out.println("It is not a leap year");
                }
            }else{
                System.out.println("It is a leap year");
            }
        }else {
                System.out.println("It is not a leap year");
            }
    }
}
