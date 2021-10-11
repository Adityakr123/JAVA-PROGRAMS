class interfaceA{
    protected void meth1(){
        System.out.println("this is method 1");
    }
    protected void meth2(){
        System.out.println("this is method 2");
    }
}
class MyClass extends interfaceA{

}
class a
{
    public static void main(String arg[]){
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
    }
}