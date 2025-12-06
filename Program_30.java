class Hero{
    String name;

    Hero(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Hero name: " + this.name);
    }
}

public class Program_30 {
    public static void main(String[] args){
        Hero h = new Hero("Shah Rukh Khan");
        h.show();
    }
}
