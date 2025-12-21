class Parent{
    int a = 10;

    void show(){
        System.out.println("This is Parent class");
    }
}

class Child extends Parent{

    int a = 20;

    void display(){
        System.out.println("Child a: " + a);
        System.out.println("Parent a: " + super.a);
        super.show();
    }
}

public class Program_46{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}