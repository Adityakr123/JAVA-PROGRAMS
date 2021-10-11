import java.util.*;
class Point 
{ 
  private float x,y;
  public void getPoint(float a,float b)
  {x=a;y=b;}
  public void print() {
  
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

public class exp2problem4 {
  public static void main(String args[])
  {
    Point a,b,c;float t;
    a=new Point();
    a.getPoint(2,4);
    a.print();
    a.fa();
    a.fb();
    a.fc();
    a.abc();
    a.print();
    b=Point.pqr(a);
    b.print();
    a=new Point();
    a.getPoint(2,4);
    c=new Point();
    c.ghi(a);
    c.print();
    t=a.getx();System.out.println(t);
  }
   
}
 