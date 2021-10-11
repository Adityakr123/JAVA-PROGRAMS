import java.util.Scanner;
class Calc{
    void power(int a, int b){
        try{
            if(a<0 || b<0){
                throw new Exception("a and b should not be negative ");}
            else if(a==0 && b==0){
                throw new Exception("a and b should not be zero");
            }
            else{
                long p=(long)Math.pow(a,b);
                System.out.println(p);
           }
        }
            catch(Exception e){
                System.out.println(e.getMessage());
            }   
        }
}
public class exp7_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calc c=new Calc();
        c.power(a,b);
        sc.close();
    }
    
}