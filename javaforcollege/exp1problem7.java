import java.util.*;

public class exp1problem7{
    public static void main(String[] args) {
        
        int x;

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        sc.close();
        int i=0;

        while(x!=0){
            int s=x%10;
            System.out.println(s*(int)Math.pow(10,i));
            x=x/10;
            i++;
        }
    }
}