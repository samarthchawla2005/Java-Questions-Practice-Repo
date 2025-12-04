class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Car starts with a key");
    }
}

class SportsCar extends Car{
    public void start(){
        System.out.println("SportsCar starts with a push button");
    }
}

public class Program_24{
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Car c = new Car();
        SportsCar sc = new SportsCar();

        v.start();
        c.start();
        sc.start();
    }
}