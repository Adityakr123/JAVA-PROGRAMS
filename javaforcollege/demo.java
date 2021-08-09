class demoo {
    private int x=10;
    int y=20;
    public int z=10;
    void printdata()
    {
        System.out.println("X="+x);
        System.out.println("Y="+y);
        System.out.println("Z="+z);
    }

       
    
}
public class demo {
    public static void main(String[] args){
        demoo d=new demoo();
        d.printdata();
        //d.x=15; x is private 
        d.y=12;
        d.z=13;
        d.printdata();
    }
}
