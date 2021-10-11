
class Comp1{
    int x=9;
    int y=2;
    int z;
    public static Comp1 mul(Comp1 b, Comp1 c)
    {
        Comp1 d = new Comp1();
        d.z=b.x*c.y;
        System.out.println(d.z);
        return d;
        
    }
}

class exp3_9{
    public static void main(String[] args)
    {
        Comp1 a = new Comp1();        
        Comp1 b = new Comp1();        
        Comp1 c = new Comp1();        
        a=Comp1.mul(b,c);            
        
    }
}