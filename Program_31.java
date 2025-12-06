class Actor{
    void intro(){
        System.out.println("I am a Bollywood Actor");
    }
}

class SRK extends Actor{
    void intro(){
        // super.intro();
        System.out.println("But I am also King Khan");
    }
}

public class Program_31 {
    public static void main(String[] args) {
        SRK s = new SRK();
        s.intro();
    }
}
