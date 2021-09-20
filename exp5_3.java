interface Area{
    final double pi = 3.14;
    double find_area(int x , int y);
}

class Circle implements Area{
    @Override
    public double find_area(int x, int y) {
        return (pi*x*x);
    }
}

class Rectangle implements Area{
    @Override
    public double find_area(int x, int y) {
        return x*y;
    }
}
 
public class exp5_3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Area a;
        a=c;
        System.out.println("Area of the Circle : " +a.find_area(5, 0));
        a=r;
        System.out.println("Area of the Rectangle : " + a.find_area(5, 2));
    }

}