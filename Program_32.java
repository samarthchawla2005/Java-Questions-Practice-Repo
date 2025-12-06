import java.util.Scanner;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("The name of the student is : " + name);
        System.out.println("The age of the student is : " + age);
    }
}

public class Program_32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the Student: ");
        String name = sc.nextLine();

        System.out.print("Enter the age of the Student : ");
        int age = sc.nextInt();

        System.out.println();

        Student student = new Student(name, age);
        student.show();
    }
}
