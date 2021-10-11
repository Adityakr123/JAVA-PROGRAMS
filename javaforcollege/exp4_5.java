import java.util.Scanner;
class Employee{
    String name;
    int empid;
    double salary;
    Employee(){
        name="ARMAN BATRA";
        empid=2200;
        salary=50000;
    }
    Employee(String n , int id , double sal){
        name=n;
        empid=id;
        salary=sal;
    }
    void increaseSalary(double percentage){
    
        salary = salary + (salary*(percentage/100));
    }
}

class Manager extends Employee{
    String  department;
    Manager(){
        super();
        department="Sales";
    }
    Manager(String n , int id , double sal , String dep){
        super(n,id,sal);
        department=dep;
    }
    void display(){
        System.out.println("Name of the Employee : " + name);
        System.out.println("Id of the Employee : " + empid);
        System.out.println("Salary of the Employee : " + salary);
        System.out.println("Department of the Employee : " + department);
    }
}

public class exp4_5 {
    public static void main(String[] args) {
        
        Manager obj = new Manager("Aditya Kumar",2134,100000,"SDE");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the percentage increase in salary :");
        int percentage=input.nextInt();
        obj.increaseSalary(percentage);
        obj.display();
    }

}