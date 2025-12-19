interface Shape{
    void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

public class Program_40 {
    public static void main(String[] args){
        Shape c = new Circle();
        c.draw();

        Shape r = new Rectangle();
        r.draw();
    }
}
