import java.util.Scanner;

abstract class Shape{

    abstract void area();

    void display(){ //Concrete Method 
        System.out.println("Calculating area of shape");
    }
}

class Rectangle extends Shape{
    void area(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle : ");
        int rec_len = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle : ");
        int rec_bre = sc.nextInt();

        display();

        int rec_ar = rec_len * rec_bre;

        System.out.println("The Area of the rectangle for length " + rec_len + " & breadth " + rec_bre + " is: " + rec_ar);
    }
}

class Circle extends Shape{
    void area(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        int r = sc.nextInt();

        display();

        double pi = 3.14;

        double cir_ar = pi*r*r;

        System.out.println("The area of circle with radius " + r + " is: " + cir_ar);
    }
}

public class Program_44 {
    public static void main(String[] args){
        Shape s;
        
        s = new Rectangle();
        s.area();

        System.out.println();

        s = new Circle();
        s.area();
    }
}
