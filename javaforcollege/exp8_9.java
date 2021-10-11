import java.lang.*;
import java.io.*; 
import java.io.IOException;

class exp8_9
{  public static void main(String args[])
   { String a,b,c;
    int count=0;
    
     try
     { 
        int start,end;
        DataInputStream o=new DataInputStream(System.in);
        a=o.readLine();
        
        char[] ch = new char[a.length()+1];
        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
        }
        for(int i=0;i<a.length();i++){
            if(ch[i]=='x')
            {
                
                count++;
            }
            
            if(count==1){
                start=i;
            }
            if(count==2){
                end=i;
            }
            
        }
        System.out.println(a.substring(start,end));

        
     }
     catch(IOException e) { System.out.println(e);  }
   }
}