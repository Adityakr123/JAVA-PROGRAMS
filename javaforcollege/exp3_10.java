import java.util.*;
class complex
{
    public void cojugate(String a){
        if( a.charAt(1) == '+'){
            String replaceString=a.replace('+','-');
            System.out.println(replaceString);
        }
        else{
            String replaceString=a.replace('-','+');
            System.out.println(replaceString);
        }
        
    }
}
public class exp3_10 {
    public static void main(String[] args){
        Scanner obj =new Scanner (System.in);    
        String s=obj.next();
        complex a=new complex();
        a.cojugate(s);
        // System.out.println(a.conjugate());

    }
}
