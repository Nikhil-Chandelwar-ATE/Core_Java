package treeMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GenericTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,Object> map = new TreeMap();
		
		map.put(20,"abc");
		map.put(10,25.78);
		map.put(40,10);
		map.put(30,'d');
		
		System.out.println(map);
		
		Collection c = map.entrySet();
		for(Object o : c)
		{
			System.out.println(o);
		}
		System.out.println();
		for (Map.Entry<Integer,Object> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println();
		
		Set s=map.keySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		Collection c1 = map.values();
		Iterator it2 = c1.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
			
		}
		System.out.println();
		
		Set s1=map.keySet();
		Iterator it3 = s1.iterator();
		while (it3.hasNext()) {
			Integer o = (Integer)it3.next();
			System.out.println(o+"="+map.get(o));
		}
	}
}
