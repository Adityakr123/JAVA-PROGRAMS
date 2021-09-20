import java.util.*;
class worker
{
    String name;
   
}
class dailyworker extends worker
{
    int rate;
    dailyworker(String b,int r)
    {
        name=b;
        rate=r;
    }
    void compay(int h)
    {
        
        System.out.println(name+" is a daily worker with salary : "+rate*h);
    }
}
class salariedworker extends worker
{
    int rate;
    salariedworker(String b,int r)
    {
        name=b;
        rate=r;
    }
    int hour=40;
    void compay()
    {
        
        System.out.println(name+" is a daily worker with salary : "+rate*hour);
    }
}
//--------- main -----------
public class exp4_3
{
    public static void main(String args[])
    {
        Scanner obj =new Scanner (System.in);
        System.out.println("Enter the name of daily worker\n");
        String namedaily=obj.next();
        System.out.println("Enter the name of salaried worker\n");
        String namesalaried=obj.next();
        System.out.println("Enter salary  of 1 day of daily worker ");
        int ratedaily =obj.nextInt();
        System.out.println("Enter working hour of daily worker ");
        int hrsdaily =obj.nextInt();
        System.out.println("Enter salary  of 1 day of salaried worker ");
        int ratesalaried =obj.nextInt();

        dailyworker d=new dailyworker(namedaily,ratedaily);
        salariedworker s=new salariedworker(namesalaried,ratesalaried);
        d.compay(hrsdaily);
        s.compay();
    }
}
