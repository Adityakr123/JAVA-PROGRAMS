public class exp3_3 {

	public static int fun(int x) {
		int result=x*x;
		return (result);
	}
	
    public static int fun(int x, int y) {
		int result=(x*x + y*y);
		return (result);
	}
	
	public static void main(String[] args) {
		int x=4;
		int y=5;
        
		int result=fun(x);
		int result1=fun(x,y);
		System.out.println(result);
		System.out.println(result1);
	}
}