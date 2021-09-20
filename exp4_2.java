import java.util.Scanner;
class player{
    public void printplayer(){
        System.out.println("Player class");
    }
}
class Cricket_Player extends player{
    public void print_cricket_player(){
        System.out.println(" Cricket Player class");
    }
}
class Football_Player extends player{
    public void print_football_player(){
        System.out.println("Football Player class");
    }
}
class Hockey_Player extends player{
    public void print_hockey_player(){
        System.out.println("Hockey Player class");
    }
}
public class exp4_2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Hockey_Player objH = new Hockey_Player();
        Football_Player objF = new  Football_Player();
        Cricket_Player objC = new Cricket_Player();
        objH.print_hockey_player();
        objH.printplayer();
        objF.print_football_player();
        objF.printplayer();
        objC.print_cricket_player();
        objC.printplayer();

    }
}
