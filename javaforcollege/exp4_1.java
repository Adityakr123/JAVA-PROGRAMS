class supper{
    private int a=10;
    private int b=10;
    private void add(){
        System.out.println(a+b);
    }
}
class derived extends supper{
    public void print(){
        System.out.println("this is a derived class");
    }
}
public class exp4_1
{
    public static void main(String args[])
    {
         derived obj =new derived();
         System.out.println(obj.a);
         System.out.println(obj.b);
         obj.add();

    }
}