import java.util.*;

public class exp1problem4{
    public static void main(String[] args) {
        
        int x;
        int sum=0;

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        sc.close();

        while(x!=0){

            sum=sum+x%10;
            x=x/10;
        }
        System.out.println("The sum of individual digits is : "+sum);
    }
}