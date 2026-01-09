//Write a Java program to count objects of a class.

import java.util.Scanner;

class Student{
    static int count = 0;

    Student(){
        count++;
    }

    static void showCount(){
        System.out.println("The Student's count is : " + count);
    }
}

public class Program_48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students to be created: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            Student s = new Student();
        }

        Student.showCount();

    }
}