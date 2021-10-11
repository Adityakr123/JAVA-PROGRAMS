class adi{
    static void add(int a ,int b){
        System.out.println(a+b);
    }
}
public class oops {
    static void myMethod(String fname) {
      System.out.println(fname + " Refsnes");
    }
  
    public static void main(String[] args) {
      myMethod("Liam");
      myMethod("Jenny");
      myMethod("Anja");
      adi obj =new adi();
      obj.add(10,20);
    }
  }