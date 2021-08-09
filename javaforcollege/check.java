import java.util.*;
import java.lang.Math;
public class check {
   

    public static void main(String[] args){
        int k;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of x");
        int x= in.nextInt();
        String temp = Integer.toString(x);
        k= temp.length();
        x=x/(int)(Math.pow(10,k-1));
    
        System.out.println("First Digit:" +x);

    }

}
