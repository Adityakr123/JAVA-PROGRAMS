import java.io.*;
import java.lang.*;
class exp7__e1{
	public static void main(String arg[]){
		String a,b;
		char c;
		a = "abcdef";
		try{
			b = a.substring(2,5);
			System.out.println(b);
		}
		catch(Exception t){
			System.out.println("The exception is "+t);
			System.out.println("Hari");
		}
	}
}
