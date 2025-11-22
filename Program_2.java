/*
 Practice Question #2

Write a program to swap two integer variables:

without using a third variable

using only arithmetic operations (no XOR trick for now)
 */

public class Program_2 {
    public static void main(String[] args){
        int a = 5, b = 9;

        System.out.println("Before Swap :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);   

        a = a + b;
        b = a - b;
        a = a - b;
         
        System.out.println("After Swap :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
