import java.io.*;
import java.util.*;
class exp7_e2{
	public static void main(String arg[]){
		int a,b,c,d,e,f,g;
		a = 12;
		b = 4;
		c = 0;
		d = 3;
		try{	
			e =a/b;
			System.out.println(e);
		}
         	catch(ArithmeticException t){
         		System.out.println("Error");
 		}
      		try{
      			e=a/c;
      			System.out.println(e);
		}
         	catch(ArithmeticException t){
         		System.out.println("Error");
 		}
      		try{
      			e=a/d;
      			System.out.println(e);
		}
         	catch(ArithmeticException t){
         		System.out.println("Error");
 		}
	}
}
