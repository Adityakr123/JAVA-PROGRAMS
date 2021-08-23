import java.util.Scanner;

public class exp1problem6{
    public static void main(String[] args) {
        int x,y,pro=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        x= sc.nextInt();
        System.out.print("Enter number 2 : ");
        y= sc.nextInt();

        sc.close();

        for(int i=0;i<y;i++)
        {
            pro=pro*x;
        }
        System.out.println("The sum of profuct of corresponding digits of the given numbers : "+pro);
    }
}