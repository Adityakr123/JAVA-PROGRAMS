import java.util.*;
public class exp1problem2{
    public static void main(String[] args){
        Scanner obj =new Scanner (System.in);
        System.out.println("Enter number");
        int a =obj.nextInt();
        while(a>10)
        {
            a=a/10;
        }
        System.out.println(a);

    }
}
