import java.util.Scanner;
import java.lang.Math;

public class exp3_6 {
	
	public static float power(float x,int n) {
		float result=(float) (Math.pow(x, n)); 
		return(result);
	}
	
    public static int power(int x,int n) {
		int result=(int) (Math.pow(x, n));
		return(result);
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter X");
		float X=sc.nextFloat();
		
		int Y=(int) X;
		
		if(X==Y) {
			int result=power(Y,n);
			System.out.println(result);
		}
		else {
			float result=power(X,n);
			System.out.println(result);
		}
	}
}
