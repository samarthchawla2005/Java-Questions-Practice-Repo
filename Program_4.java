/*
  Write a Java program to find the largest of three numbers.

Conditions:

No Scanner (use fixed values)

Use if–else if–else

Example format:

a = 10
b = 25
c = 7

Largest = 25

Reminder:

You must compare like this:

if (a > b && a > c)
 
 */

public class Program_4 {
    public static void main(String[] args){
        int a = 10, b = 25, c = 7;

        if(a > b && a > c){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
