package hashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(101,"Nikhil");    //to add an entry
		map.put('c',10);
		map.put("hello",'c');
		map.put("hello",'c');
		map.put("hello",'d');
		map.put(97.78,"Nikhil");
		map.put(null,"ok");
		map.put(null,97);
		map.put(78,null);
		map.put(88,null);
		System.out.println(map.get('c'));
		System.out.println(map.get("hello"));
		System.out.println(map.get(null));    //to get value of a key
		
		System.out.println(map.remove("hello"));    //to remove one entry
		System.out.println(map.replace(88, null, "laila"));   //to replace value 
		
		System.out.println(map.entrySet());	//to get all entries(key=value)
		System.out.println(map.keySet());	//to get all the keys
		System.out.println(map.values());	//to get all the values
		System.out.println(map.size());
		System.out.println();
		Collection c=map.entrySet();
		for (Object object : c) {
			System.out.println(object);
		}
		System.out.println();
		
		System.out.println(map);
	}
}
