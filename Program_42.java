class Message {
    void send(String msg){
        System.out.println("Message: " + msg);
    }

    void send(String msg, String receiver){
        System.out.println("Message: " + msg + " to " + receiver);
    }

    void status(){
        System.out.println("Message sent using basic service");
    }
}

class WhatsAppMessage extends Message{
    void status(){
        System.out.println("Message sent using WhatsApp service");
    }
}

public class Program_42{
    public static void main(String[] args){
        Message m = new Message();
        m.send("Hello");
        m.send("Hello","Sam");

        System.out.println();

        Message ref;
        ref = new WhatsAppMessage();
        ref.status();
    }
}