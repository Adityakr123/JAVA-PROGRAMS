import java.util.*;

public class exp7_1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of students : ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.println(n);
        String[] name=new String[n];
        int[] rollno=new int[n];
        for (int i=0;i<n;i++) {
                System.out.println("Enter the name of student "+(i+1)+" :\n");
                sc.nextLine();
                name[i]=sc.next();
                System.out.println("Enter the roll number of student "+(i+1)+" :");
                rollno[i]= sc.nextInt();
        }
        System.out.println("Enter the index number to print name and rollnumber\n");
        
        int x= sc.nextInt();
        try {
            System.out.println(name[x]);
            System.out.println(rollno[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have entered the invalid index");
            System.out.println("Please enter an index between 0 and "+n);
        }
   
    }

}
