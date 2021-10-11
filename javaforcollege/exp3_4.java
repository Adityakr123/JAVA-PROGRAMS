public class exp3_4 {
	
	public static int fun(int x) {
		return (x);
	}
	
	public static int fun(int x,int y) {
		int s=x+y;
		return (s);
	}
	
	public static int fun(int x,int y,int z) {
		int m=x*y*z;
		return (m);
	}
	
	public static void main(String[] args) {
		int x=2;
		int y=4;
		int z=3;
		
		int result1=fun(x);
		int result2=fun(x,y);
		int result3=fun(x,y,z);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


	}
}