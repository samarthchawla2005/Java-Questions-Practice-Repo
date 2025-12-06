class Movie{
    void info(){
        System.out.println("This is movie's info");
    }
}

class BollywoodMovie extends Movie{
    void info(){
        super.info();
        System.out.println("This is the main info of the movie");
    }
}

public class Program_33 {
    public static void main(String[] args){
        Movie m = new Movie();
        m.info();

        System.out.println();

        BollywoodMovie bm = new BollywoodMovie();
        bm.info();
    }

}
