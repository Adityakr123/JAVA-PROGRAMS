/**
 * InnerEx9Q4
 */

class ThreadA extends Thread{
    public void run(){
        System.out.println("ThreadA Started");
        for(int i=1;i<=5;i++){
            System.out.println("ThreadA : " + i);
        }
    }
}

class ThreadB extends Thread{
    public void run(){
        System.out.println("ThreadB Started");
        try{
            for(int i=11;i<=15;i++){
                System.out.println("ThreadB : " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException E){
            System.out.println("An Interruption has occurred");
        }
    }
}

class ThreadC extends Thread{
    public void run(){
        System.out.println("ThreadC Started");
        for(int i=21;i<=25;i++){
            System.out.println("ThreadC : " + i);
        }
    }
}

class ThreadD extends Thread{
    public void run(){
        System.out.println("ThreadD Started");
        try{
            for(int i=31;i<=35;i++){
                System.out.println("ThreadD : " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException E){
            System.out.println("An Interruption has occurred");
        }
    }
}

class ThreadE extends Thread{
    public void run(){
        System.out.println("ThreadE Started");
        for(int i=41;i<=45;i++){
            System.out.println("ThreadE : " + i);
        }
    }
}

public class Ex9Q4 {
    public static void main(String[] args) {
        ThreadA A = new ThreadA();
        ThreadB B = new ThreadB();
        ThreadC C = new ThreadC();
        ThreadD D = new ThreadD();
        ThreadE E = new ThreadE();
        System.out.println("ThreadA is Alive :" + A.isAlive());
        System.out.println("ThreadB is Alive :" + B.isAlive());
        System.out.println("ThreadC is Alive :" + C.isAlive());
        System.out.println("ThreadD is Alive :" + D.isAlive());
        System.out.println("ThreadE is Alive :" + E.isAlive());
        A.setPriority(1);
        B.setPriority(7);
        C.setPriority(4);
        D.setPriority(5);
        E.setPriority(2);
        A.start();
        B.start();
        C.start();
        D.start();
        E.start();
        System.out.println("ThreadA is Alive : " + A.isAlive());
        System.out.println("ThreadB is Alive : " + B.isAlive());
        System.out.println("ThreadC is Alive : " + C.isAlive());
        System.out.println("ThreadD is Alive : " + D.isAlive());
        System.out.println("ThreadE is Alive : " + E.isAlive());
    }    
}