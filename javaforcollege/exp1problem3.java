import java.util.Scanner;

public class exp1problem3 {
    public static void main(String[] args) {
        int x,y=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        
        x= sc.nextInt();
        sc.close();

        while(x>99){
            y=x%100;
            x=x/10;
        }
        System.out.println("Second digit of the number is : "+y);
    }
}
