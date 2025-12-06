class AreaCalculator{
    public int area(int side){
        int sq_ar =  side*side;
        System.out.println("The area of the square with sides " + side + " is: " + sq_ar);
        return sq_ar;
    }

    public int area(int length, int width){
        int rec_ar = length*width;
        System.out.println("The area of the rectangle with length " + length +" & width " + width + " is: " + rec_ar);
        return rec_ar;
    }

    public double area(double radius){
        double cir_ar = 3.14 * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + cir_ar);
        return cir_ar;
    }

    public double area (double base, double height){
        double tri_ar = 0.5 * base * height;
        System.out.println("The area of the triangle with base " + base + " & height " + height + " is: " + tri_ar);
        return tri_ar;
    }



}

public class Program_29 {
    public static void main(String[] args){

        AreaCalculator ac = new AreaCalculator();
        ac.area(4);
        ac.area(10,4);
        ac.area(5.5);
        ac.area(8.0,6.0);
    }
}
