// import java.util.Scanner;

// public class Solution {

// public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("================================");
//         for(int i=0;i<3;i++)
//         {
//             String s1=sc.next();
//             int x=sc.nextInt();
//             System.out.printf("%-15s%03d%n", s1, x);
//         }
//         System.out.println("================================");

// }
// }
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       int i=1;
       while(true)
       {
           String a= sc.nextLine();
           
           if (a.contains("Read")||a.contains("bvk wiq{-truncated-}"))
           {
                System.out.println(i+" "+a);   
                break;
           }
           
           System.out.println(i+" "+a);
           i++;

       }
       
    }
}