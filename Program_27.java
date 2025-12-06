class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b ){
        return a+b;
    }
}

public class Program_27 {
    public static void main(String[] args){
        // Calculator obj1 = new Calculator();
        // int r1 = obj1.add(1,2);
        // System.out.println(r1);
        // Calculator obj2 = new Calculator();
        // int r2 = obj2.add(1,2,3);
        // System.out.println(r2);
        // Calculator obj3 = new Calculator();
        // double r3 = obj3.add(1.9870,1213.14);
        // System.out.println(r3);

        Calculator obj = new Calculator();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(1.9870,1213.14));
    }
}
