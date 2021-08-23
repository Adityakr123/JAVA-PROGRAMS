import java.util.Scanner;

public class exp3_7 {

	public static int max(int x,int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	public static float max(float x,float y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		float num1=sc.nextFloat();
		System.out.print("Enter another number: ");
		float num2=sc.nextFloat();
		
		int num3=(int) num1;
		int num4=(int) num2;
		
		if(num1==num3 || num2==num4) {
			int result=max(num3,num4);
			System.out.println(result);
		}
		else {
			float result=max(num1,num2);
			System.out.println(result);
		}
	}

}