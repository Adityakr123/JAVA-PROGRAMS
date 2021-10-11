import java.io.*;
import java.util.*;
class exp7_e3{
  public static void main (String args[])
  {   
  	int a,b,c,d,e,f;
  	a=25;
  	b=4;
  	c=0;
  	d=3;
      	try{
		e=a/b;
		System.out.println(e);
		e=a/c;
		System.out.println(e);
		e=a/d;
		System.out.println(e);
	}
      	catch (ArithmeticException t)
      	{
      		System.out.println("mistake");
	}
      	System.out.println("Hari");
  }
}
