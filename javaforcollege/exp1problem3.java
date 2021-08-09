import java.util.*;
public class exp1problem3 {
    public static void main(String[] args){
        Scanner obj =new Scanner (System.in);
        System.out.println("Enter number"); 
        int a =obj.nextInt();
        
        System.out.println("Enter kth value"); 
        int k =obj.nextInt();
        for(int i=0;i<k-1;i++)
        {
            a=a/10;
        }
        System.out.println(a%10); 
    }
}
