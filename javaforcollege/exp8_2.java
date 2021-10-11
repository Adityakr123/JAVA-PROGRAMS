import java.lang.*;
import java.io.*; 
import java.util.Scanner;
import java.io.IOException;

class exp8_2
{  public static void main(String args[])
   { String a,b,c;
     try
     { 
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        c=a.substring(0,2);
        b=a.substring(3,a.length());
        System.out.println(c+b);
     }
     catch(IOException e) { System.out.println(e);  }
   }
}

