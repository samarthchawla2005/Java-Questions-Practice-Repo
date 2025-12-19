interface Readable{
    void read();
}

interface Writable{
    void write();
}

class Book implements Readable,Writable{
    public void read(){
        System.out.println("Reading the book");
    }

    public void write(){
        System.out.println("Writing the book");
    }
}

public class Program_39 {
    public static void main(String[] args){
        Book obj = new Book();

        obj.read();
        obj.write();
    }
}
