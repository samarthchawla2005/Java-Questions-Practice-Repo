interface Printable{
    void print();
}

class Documents implements Printable{
    public void print(){
        System.out.println("Document is printing...");
    }
}

public class Program_38 {
    public static void main(String[] args){
        Documents obj = new Documents();
        obj.print();
    }
}
