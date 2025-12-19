interface Payment{
    void pay();
}

class UPIPayment implements Payment{
    public void pay(){
        System.out.println("UPI Payment Succesful");
    }
}

public class Program_41 {
    public static void main(String[] args){
        Payment p = new UPIPayment();
        p.pay();
    }
}
