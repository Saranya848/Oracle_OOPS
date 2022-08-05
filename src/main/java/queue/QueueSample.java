package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		Queue<Object> queue = new LinkedList<Object>();
		
		//Adding data into Queue
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println(queue);
			
		//removing data in Queue
		queue.remove("three");
		System.out.println(queue);
		
		//Checking size of queue
		System.out.println("Queue Size: " + queue.size());
		
		//checking of data
		System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));

		// To empty the queue
		queue.clear();
	}

}
