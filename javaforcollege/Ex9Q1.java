
class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Extended Thread : " + i);
        }
        System.out.println("Extended Thread has finished it's execution");
    }
    
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=101;i<=105;i++){
            System.out.println("Implemented Thread : " + i);
        } 
        System.out.println("Implemented Thread has finishes it's execution");       
    }
}

public class Ex9Q1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread t = new Thread(t2);
        t.start();
        t1.start();
    }    
}