import java.lang.*;
import java.io.*; 
import java.util.Scanner;
import java.io.IOException;

class exp8_1
{  public static void main(String args[])
   { String a,b;
     try
     { 
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        b=a.substring(2,5);
        System.out.println(b);
     }
     catch(IOException e) { System.out.println(e);  }
   }
}

