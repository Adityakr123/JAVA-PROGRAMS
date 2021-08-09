import java.util.Scanner;

public class exp1problem5 {
    public static void main(String[] args) {
        int x;
        int sum=0;

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        sc.close();

        while(x!=0){
            int y = x%10;
            x=x/10;
            sum = sum + y*(x%10);
        }

        System.out.println("Sum of consecutive digits of given number is = "+sum);

    }
}