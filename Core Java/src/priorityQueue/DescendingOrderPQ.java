package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DescendingOrderPQ {

	String name;
	int age;
	DescendingOrderPQ(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		
		return "[Name: "+name+", Age:"+age+"]";
	}
	public static void main(String[] args) {
		PriorityQueue<DescendingOrderPQ> pq = new PriorityQueue<>(new Comparator<DescendingOrderPQ>() {
		
			@Override
			public int compare(DescendingOrderPQ o1, DescendingOrderPQ o2) {
				
				return o2.name.compareTo(o1.name);
			}
		});
		
		pq.offer(new DescendingOrderPQ("Nikhil",25));
		pq.offer(new DescendingOrderPQ("Vijay",23));
		pq.offer(new DescendingOrderPQ("Abhay",26));
		pq.offer(new DescendingOrderPQ("Sangram",22));
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
	}
}
