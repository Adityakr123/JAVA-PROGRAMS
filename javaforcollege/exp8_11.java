import java.lang.*;
import java.io.*; 
import java.io.IOException;

class exp8_11
{  public static void main(String args[])
   { String a,b,c;
     try
     { 
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        int count=0;
        int j=0;
        int k=0;
        char[] ch = new char[a.length()+1];
        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
        }
        for(int i=0;i<a.length();i++){
            if(ch[i]=='x')
            {
                
                count++;
                if(count==1){
                    k=i;
                   
                }
            
                else if(count==2){
                    j=i;
                    break;
                }
            }
        }
        
        b=a.substring(0,k+1);
        c=a.substring(j,a.length());
        System.out.println(b+c);
        
     }
     catch(IOException e) { System.out.println(e);  }
   }
}