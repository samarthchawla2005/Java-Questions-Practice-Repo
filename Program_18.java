/*
Write a Java program to:

Create two strings

Compare them using euqals()

Print

"Both strings are equal" OR

"Strings are NOT equal"
*/

public class Program_18 {
    public static void main(String[] args){
        String s1 = "SRK";
        String s2 = "SRK";

        if(s1.equals(s2)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }
    }
}
