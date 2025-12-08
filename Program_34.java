class Parent{
    public int x = 10;
    protected int y = 20;
    int z = 30;
    private int w = 40;

    void display(){
        System.out.println("w = " + w);
    }
}

class Child extends Parent{
    void show(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        // System.out.println(w);
    }
}

public class Program_34 {
    public static void main(String[] args){
        Child c = new Child();
        c.show();
        c.display();
    }
}
