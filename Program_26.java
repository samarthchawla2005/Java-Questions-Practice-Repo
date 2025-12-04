class A{
    public void showA(){
        System.out.println("This is Class A");
    }
}

class B extends A{
    public void showB(){
        System.out.println("This is Class B");
    }
}

class C extends B{
    public void showC(){
        System.out.println("This is Class C");
    }
}

public class Program_26{
    public static void main(String[] args){
        C c = new C();

        c.showA();
        c.showB();
        c.showC();
        
    }
}