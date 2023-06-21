package priorityQueue;

import java.util.PriorityQueue;

public class PQ1 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		pq.offer(45);
		pq.offer(34);
		pq.offer(74);
		pq.offer(74);
		pq.offer(84);
		pq.offer(15);
		pq.add(47);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.remove(74));
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		System.out.println(pq);
//		
//		System.out.println(pq);
//		System.out.println(pq.peek());
//		System.out.println(pq.peek());
//		
//		System.out.println(pq.poll());
//		pq.remove(74);
//		
//		System.out.println(pq);
	}
}
