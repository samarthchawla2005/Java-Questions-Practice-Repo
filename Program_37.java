class Parent{
    final void show(){
        System.out.println("Inside Parent show()");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Inside Child show()");
    }
}

public class Program_37{
    public static void  main(String[] args){
        Parent p;

        p = new Parent();
        p.show();

        p = new Child();
        p.show();
    }
}