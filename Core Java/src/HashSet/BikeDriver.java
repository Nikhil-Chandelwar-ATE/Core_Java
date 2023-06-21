package HashSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
public class BikeDriver {

	public static void main(String []args)
	{
		HashSet<Bike> hash = new HashSet<Bike>();
		hash.add(new Bike("MT15",150,"White & Gold",211000.67));
		hash.add(new Bike("Bulet",350,"Matte Black",351000.46));
		hash.add(new Bike("Splendor",105,"Royal Blue",84500.39));
		hash.add(new Bike("R15",300,"Cherrish Red",256000.23));
		hash.add(new Bike("HF Deluxe",95,"Black & White",79480.45));
		hash.add(new Bike("HF Deluxe",95,"Black & White",79480.45));
		
		System.out.println("Your entered Bike details");
		System.out.println("----------------------------------------------");
		Iterator it = hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ArrayList list = new ArrayList(hash);
		Collections.sort(list);
		System.out.println("Sorted Bike details according to CC");
		System.out.println("----------------------------------------------");
		for (Object object : list) {
			System.out.println(object);
		}
}
}