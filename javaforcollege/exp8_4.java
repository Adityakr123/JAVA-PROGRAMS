import java.lang.*;
import java.io.*; 
import java.util.Scanner;
import java.io.IOException;

class exp8_4
{  public static void main(String args[])
   { String a,b,c;
     try
     { 
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        c=a.substring(0,2);
        char[] ch = new char[c.length()+1];
        
  
        // Copy character by character into array
        for (int i = 0; i < c.length(); i++) {
            ch[i] = c.charAt(i);
        }
        for(int i=c.length();i>=0;i--)
        {
            System.out.print(ch[i]);
        }
        b=a.substring(2,a.length());
        System.out.print(b);
     }
     catch(IOException e) { System.out.println(e);  }
   }
}

