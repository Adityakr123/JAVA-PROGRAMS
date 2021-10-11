import java.lang.*;
import java.io.*; 
import java.io.IOException;

class exp8_10
{  public static void main(String args[])
   { String a,b,c;
     try
     { 
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        int count=0;
        int j=0;
        char[] ch = new char[a.length()+1];
        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
        }
        for(int i=0;i<a.length();i++){
            if(ch[i]=='x')
            {
                
                count++;
            }
            
            if(count==2){
                j=i;
                break;
            }
            
        }
        b=a.substring(0,j);
        System.out.println(b);
        
     }
     catch(IOException e) { System.out.println(e);  }
   }
}