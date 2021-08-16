import java.util.*;
 class student {
    public String name;
    public String city;
    public double cgpa;
}
class acseesspecifier{
    public static void main(String[] args){
        student Amit =new student();
        Amit.name="Amit Kumar";
        Amit.city="Delhi";
        Amit.cgpa =8.54;
        System.out.println(Amit.name+" "+Amit.city+" "+Amit.cgpa);
    }
}
