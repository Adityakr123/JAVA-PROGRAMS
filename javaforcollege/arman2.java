import java.util.*;

class Box {
    Box() {
        System.out.println("Object of Box is created");
    }
    
    void dimensions(int l,int b) {
        
        System.out.println("The length of the box is: "+l);
        System.out.println("The breadth of the box is: "+b);
        
    }
    
}

class Box3d extends Box {
    Box3d() {
        System.out.println("Object of Box3d is created");
    }
    
    void dimensions(int l,int b,int h) {
        super.dimensions(l,b);
        System.out.println("The height of the box is: "+h);
    }
    
}


public class arman2
{
	public static void main(String[] args) {
	    
	    Box b = Box();
	    Box3d b1 = Box3d();
	    
	    Scanner sc = new Scanner(System.in);
	    
        int length;
        System.out.println("Enter length: ");
        length = sc.nextInt();
        
        int breadth;
        System.out.println("Enter breadth: ");
        breadth = sc.nextInt();
        
        int height;
        System.out.println("Enter height: ");
        height = sc.nextInt();
	    
	    b.dimensions(l,b);
	    b1.dimensions(l,b,h);
	    sc.close();
	   
	    
	}
}