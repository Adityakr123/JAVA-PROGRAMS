import java.util.*;

class ObjectPassDemo
{
    int a, b;
  
    ObjectPassDemo(int i, int j)
    {
        a = i;
        b = j;
        
    }

    void  multiply (ObjectPassDemo o)
    {
        System.out.println((o.a*a-o.b*b)+" + i"+(o.a*b+o.b*a));
    }
}

public class exp3_8
{
    public static void main(String args[])
    {
        Scanner obj =new Scanner (System.in);
        System.out.println("enter real part of first complex number ");
        int a = obj.nextInt();
        System.out.println("enter complex part of first complex number ");
        int b = obj.nextInt();
        System.out.println("enter real part of second complex number ");
        int c = obj.nextInt();
        System.out.println("enter complex part of second complex number ");
        int d = obj.nextInt();
        ObjectPassDemo ob1 = new ObjectPassDemo(a,b);
        ObjectPassDemo ob2 = new ObjectPassDemo(c,d);
        ob1.multiply(ob2);
    }
}