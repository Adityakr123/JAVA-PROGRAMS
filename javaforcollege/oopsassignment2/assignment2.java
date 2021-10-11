package oopsassignment2;
import java.util.*;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();                             
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            arr[i]=sc.next();
        }
        String newstring = arr[0];
        char[] result=new char[100];
        char elements[] = newstring.toCharArray(); 
        
        for(int i=1;i<n;i++){
            String newstring1 = arr[i];
    
            char elements1[] = newstring1.toCharArray();
            
            for(int k=0;k<newstring.length();k++){
                for(int j=0;j<newstring1.length();j++){
                       
                    if(elements[k]==elements1[j]){
                        result[k]=elements1[j];
                        break;
                    }
                    else{
                        result[k]='0';
                    }
                    
                }
                
                
            }
               
            for(int k=0;k<newstring.length();k++)
            {
                elements[k]=result[k];  
            }
        }
        for(int i=0;i<newstring.length()-1;i++){
            for(int j=i+1;j<newstring.length();j++){
                if (result[i]==result[j]){
                    
                    result[j]='0';
                }
            }
        }
        int count=0;
        for(int i=0;i<newstring.length();i++){
            if (result[i]!='0'){
                count++;
            }
        }
        
        System.out.println(count);
        }
}
