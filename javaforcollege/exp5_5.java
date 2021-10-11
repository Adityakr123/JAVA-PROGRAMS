interface StackInterface{
   public void push1(int data);
   public int pop1(int data);
   public void display();

}
class exp5_5 implements StackInterface
{
   int stack[]=new int[5];
   int top=0;
   public static void main(String[]args){
       exp5_5 s=new exp5_5();
       s.push1(10);
       s.push1(12);
       s.push1(130);
       s.display();

       System.out.println("\npopped element is "+s.pop1(130));
       s.display();

       System.out.print("\npopped element is "+s.pop1(12)+"\n");
       s.display();
   }
   @Override
   public void push1(int data)
   {
       stack[top]=data;
       top++;
   }
   public int pop1(int data)
   {
       top--;
       data=stack[top];
       stack[top]=0;
       return data;
   }
   public void display()
   {
       for (int n : stack){
           System.out.print(n+" ");
       }


   }

}