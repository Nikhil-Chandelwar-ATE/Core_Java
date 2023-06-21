package priorityQueue;
import java.util.PriorityQueue;

public class Employee implements Comparable{

	String name;
	int id;
	Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return "[Name: "+name+", ID: "+id+"]";
	}
	public int compareTo(Object o)
	{
		Employee e = (Employee)o;
		return this.id-e.id;
	}
	
	public static void main(String[] args)
	{
		PriorityQueue pq = new PriorityQueue();
		
		pq.offer(new Employee("nikhil",101));
		pq.offer(new Employee("ajay",401));
		pq.offer(new Employee("sanjay",201));
		pq.offer(new Employee("salman",601));
		pq.offer(new Employee("shah rukh",501));
		
		System.out.println(pq);
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
	}
}
