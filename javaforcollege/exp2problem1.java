import java.util.*;
class Point 
{ private float x,y;
  public void getPoint(float a,float b)
  {x=a;y=b;}
  public void print() 
  {
   System.out.println("("+x+","+y+")");
  }
  public  void fa(){
    System.out.println("("+(x+y)+","+(2*y)+")"); //editing for question 3
  }
  public  void fc(){
    System.out.println("("+(x+y)+","+(x*y)+")"); //editing for question 4partb
  }
  public  void fb(){
    System.out.println("("+(2*x)+","+(x+y)+")"); //editing for question 4parta
  }
  public void abc() {x=2*x;y=3*y;}
  public static Point pqr(Point a) 
  { Point t;
    t=new Point();
    t.getPoint(2*a.x,2*a.y);
    return t;
  }
  public void ghi(Point a) 
  {  x=2*a.x;y=3*a.y;  }
  public float getx()
  {  return x;   }
}

public class exp2problem1 {
    public static void main(String[] args){
        Point obj1=new Point();
        Scanner obj =new Scanner (System.in);
        System.out.print("Enter a point ");
        
        int x= obj.nextInt();
        System.out.print("Enter another point ");
        int y=obj.nextInt();
        obj1.getPoint(x,y);

    }
}

