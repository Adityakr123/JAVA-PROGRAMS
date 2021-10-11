import java.lang.*;
import java.io.*; 
import java.io.IOException;

class exp8_5
{  public static void main(String args[])
   { String a,b,c;
     try
     { 
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        c=a.substring(0,2);
        b=a.substring(2,a.length());
        
        System.out.println(c+'t'+b);
     }
     catch(IOException e) { System.out.println(e);  }
   }
}

