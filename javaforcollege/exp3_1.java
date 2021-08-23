import java.util.*;

public class exp3_1 {
	
	public static int integer(int a) {
		int s=a*a;
		return (s);
	}
	
	public static float decimal(float a) {
		float s=a*a;
		return (s);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		float n=sc.nextFloat();
		int i=(int) n;
		if(n==i) {
			int result=integer(i);
			System.out.println(result);
		}
		else {
			float result=decimal(n);
			System.out.println(result);
		}
	}
}