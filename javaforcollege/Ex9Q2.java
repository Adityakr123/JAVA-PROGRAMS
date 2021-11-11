/**
 * InnerEx9Q2
 */

class EvenThread extends Thread{
    public EvenThread(){
        super("Thread Printing Even Values");
    }
    public void run(){
        try{
            for(int i=2;i<=20;i+=2){
                System.out.println("EvenThread : " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException E){
            System.out.println("Another Thread has Interrupted EvenThread");
        }
    }
}

class OddThread extends Thread{
    public OddThread(){
        super("Thread Printing Odd Values");
    }
    public void run(){
        try{
            for(int i=1;i<=20;i+=2){
                System.out.println("OddThread : " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException E){
            System.out.println("Another Thread has Interrupted OddThread");
        }
    }
}

public class Ex9Q2 {
    public static void main(String[] args) {
        EvenThread e = new EvenThread();
        OddThread o = new OddThread();
        e.start();
        o.start();

    }    
}