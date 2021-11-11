import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class exp10_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=5;i<=10;i++){
            arr.add(i);
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        Iterator<Integer> i = arr.iterator();
        while(i.hasNext()){
            hs.add(i.next());
        }
        System.out.println("HashSet :");
        System.out.println(hs);
        i = arr.iterator();
        System.out.println("Array : ");
        while(i.hasNext()){
            System.out.println(" " + i.next());
        }
    }    
}
