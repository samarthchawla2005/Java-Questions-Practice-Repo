package studentpack;

import java.util.Scanner;

public class Student {
    public void showDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's name : ");
        String name = sc.next();

        System.out.println("Enter Student's age : ");
        int age = sc.nextInt();

        System.out.println("Enter Student's Roll Number : ");
        int roll_Num = sc.nextInt();

        System.out.println("The entered student details are :");
        System.out.println("Student Name : " + name +"\n"+ "Student 's age' : " + age +"\n"+ "Students Roll Number : " + roll_Num);

        sc.close();
    }
}
