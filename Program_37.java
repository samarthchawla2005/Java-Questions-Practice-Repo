//This code will not be exectued if final keyword is not removed

class Parent{
    //final method cannot be overiden by child class by can be inherited
    // final void show(){ //If we remove final keyword it will work
    void show(){
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
