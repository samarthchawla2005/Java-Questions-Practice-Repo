class Movie{
    void info(){
        System.out.println("General Movie Information");
    }
}

class ActionMovie extends Movie{
    void info(){
        System.out.println("Action Movie – Fight Scenes Included");
    }
}

class ComedyMovie extends Movie{
    void info(){
        System.out.println("Comedy Movie – Fun & Entertainment");
    }
}

public class Program_35 {
    public static void main(String[] args){
        Movie m;

        m = new ActionMovie();
        m.info();

        m = new ComedyMovie();
        m.info();
    }
}
