class NonNum extends Exception
{
NonNum() {
super("the value is non numeric \n");
}
}
public class exp7_2 {
public static void main(String[] args) {
int a,b,c=0;
try {
a=Integer.parseInt(args[0]);
throw new NonNum();
}
catch(NumberFormatException e) {
System.out.println(e);
}
catch(NonNum e) {
System.out.println(e);
}
}
}