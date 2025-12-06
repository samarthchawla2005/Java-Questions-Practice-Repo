class Display{
    public void show(String name, int age){
        System.out.println("Name : " + name + "," + "Age : " + age);
        System.out.println("Age : " + age + "," + "Name : " + name);
    }

}

public class Program_28 {
    public static void main(String[] args) {
        Display d = new Display();
        d.show("Sam", 20);
    }
}
