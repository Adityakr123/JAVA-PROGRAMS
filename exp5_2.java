interface A{
    public void meth1();
    public void meth2();
}

class MyClass implements A{

    @Override
    public void meth1() {
        System.out.println("Method 1 of Inteface Implemented under MyClass class");        
    }

    @Override
    public void meth2() {
        System.out.println("Method 2 of Inteface Implemented under MyClass class");
        
    }


}

public class exp5_2 {
    public static void main(String[] args) {
        A obj = new MyClass();
        obj.meth1();
        obj.meth2();
        
        
    }    
}