interface Test{
    int square(int a);
}

class Arithmetic implements Test{
    int ans=0;
    @Override
    public int square(int a) {       
        System.out.println("Sqaure of " + a + " is :");
        ans = a*a;
        return ans;
    }
    public void display(){
        System.out.println("Interface method called in Arithmetic class");
    }    
}

public class exp5_1 {
    public static void main(String[] args) {        
        Test t = new Arithmetic();         
        int ans = t.square(10);
        System.out.println(""+ans);
    }        
}