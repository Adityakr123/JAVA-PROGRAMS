import java.util.*;
import java.util.Map.Entry;
public class exp10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			HashMap<Integer, String> Subjects = new HashMap<Integer, String>();
		    Subjects.put(1, "JAVA");
		    Subjects.put(2, "PYTHON");
		    Subjects.put(3, "C");
		    System.out.println("Enter the key you want to find out: ");
		    int k = sc.nextInt();
	        boolean flag2 = Subjects.containsKey(k);
	        System.out.println("Key exists in Hashmap? : "  + flag2);
	        
	        System.out.println("************************************");

	        System.out.println("Enter the value you want to find: ");
	        String a = sc.next();
	        boolean flag = Subjects.containsValue(a);
	        System.out.println("Value exists in HashMap? : " + flag);
	        
	        System.out.println("************************************");
	        
	        Set<Integer> keys = Subjects.keySet();
	        for(Integer key: keys){
	            System.out.println(key);
	        }
	        
	        System.out.println("************************************");
	        
	        Set<Entry<Integer, String>> setOfEntries = Subjects.entrySet();
	        System.out.println("\n\nIterating Entries \n");
	        for(Entry<Integer, String> entry : setOfEntries){
	            System.out.println("Key : "  + entry.getKey() + "\t\t" + "Value : "  + entry.getValue());
	        }
	}
}

