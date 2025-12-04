class Device{
    public void turnOn(){
        System.out.println("Device is turning on");
    }
}

class Phone extends Device{
    public void turnOn(){
        System.out.println("Phone is booting up");
    }
}

class Smartphone extends Phone{
    public void turnOn(){
        System.out.println("Smartphone is powering with face unlock");
    }
}

public class Program_25{
    public static void main(String[] args){
        Device d = new Device();
        Phone p = new Phone();
        Smartphone s = new Smartphone();

        d.turnOn();
        p.turnOn();
        s.turnOn();
    }
}