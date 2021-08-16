import java.util.*;
    public  class ARRAY{
       
        public static void main(String[] args)
        {
            Scanner obj =new Scanner (System.in);
            int n;
            int a[]=new int[100];
            int b[]={2,3,4,5};
            System.out.println(b);
            n=obj.nextInt(); 
            for(int i=0;i<b.length;i++)
            {
                System.out.println(b[i]);
            }
            for(int i=0;i<n;i++)
            {
                a[i]=obj.nextInt();
            }
            int i=0;
            while(i<n)
            {
                System.out.print(a[i]+" ");
                i++;
            }
    
           
        }
    
    }
       

