import java.util.*;//this is 8,9 question

public class Comp {
	int x;
	Comp(int data){
		x=data;

	}
	static void mul(Comp obj1,Comp obj2) {
		obj1.x=obj1.x*obj2.x;
	}
	
	static void mul(Comp obj1,Comp obj2,Comp obj3) {
		obj1.x=obj2.x*obj3.x;
	}
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(); //5
		int B=sc.nextInt(); //6
		int C=sc.nextInt(); //7
		Comp a=new Comp(A); //a.x=5
		Comp b=new Comp(B); //b.x=6
		Comp c=new Comp(C); //c.x=7
		mul(a,b);           //module taking 2 parameter
		System.out.println("a.mul(b)="+a.x);
		mul(a,b,c);
		System.out.println("a.mul(b,c)="+a.x);
		sc.close();
	}
}