import java.lang.*;
import java.io.*; 
import java.io.IOException;

class exp8_3
{  public static void main(String args[])
   { String a,b,c;
     try
     { 
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        c=a.substring(0,1);
        
        System.out.println(c+a);
     }
     catch(IOException e) { System.out.println(e);  }
   }
}

