import java.util.*;
public class exp2problem2 {
    public static void main(String args[])
    {   Point a,b,c;
        float t;
        a=new Point();
        System.out.print("Enter a point ");
        Scanner obj =new Scanner (System.in);
        int x= obj.nextInt();
        System.out.print("Enter another point ");
        int y=obj.nextInt();
        a.getPoint(x,y);
        a.print();
        a.abc();
        a.print();
        b=Point.pqr(a);
        b.print();
        a=new Point();
        a.getPoint(2,4);
        c=new Point();
        c.ghi(a);
        c.print();
        t=a.getx();
        System.out.println(t);
     }
   
}
