import java.util.*;
class exception_class extends Exception
{
public String getMessage()
{
return super.getMessage() + "Entered Number was less than 500 \n ";
}
exception_class()
{
super("Invalid Input! \n");
}
}
public class exp7_3 {
public static void main(String[] args) throws Exception {
Scanner inp = new Scanner(System.in);
System.out.println("Enter any number: ");
int num = inp.nextInt();
inp.close();
if (num < 500) {
try {
throw new exception_class();
}
catch (Exception e) {
System.out.println(" " + e.getMessage());
}
}
else {
System.out.println("Entered Number is: " + num);
}
}
}