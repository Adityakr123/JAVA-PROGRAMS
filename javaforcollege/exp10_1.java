import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class exp10_1 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Baleno");
		cars.add("Breeza");
		cars.add("i-20");
		Iterator<String> itr = cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("*********************************");
        ArrayList<String> cars2 = new ArrayList<String>();
        cars2 = (ArrayList)cars.clone();
        System.out.println(cars2);
        System.out.println("*********************************");
        Collections.reverse(cars);
        for(String str: cars){
            System.out.println(str);
        }
	}
}
