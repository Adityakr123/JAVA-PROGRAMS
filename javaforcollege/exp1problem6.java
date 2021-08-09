import java.util.Scanner;

public class exp1problem6{
    public static void main(String[] args) {
        int x,y,sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        x= sc.nextInt();
        System.out.print("Enter number 2 : ");
        y= sc.nextInt();

        sc.close();

        while(x!=0){

            sum+= (x%10)*(y%10);
            x/=10;
            y/=10;
        }
        System.out.println("The sum of profuct of corresponding digits of the given numbers : "+sum);
    }
}