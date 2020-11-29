package queues;

public class Main {
	
	public static void main(String[] args) {
		////////// ARRAYQUEUE //////////
		System.out.println("===== ARRAY QUEUE =====\n");
		ArrayQueue<Integer> aq1 = new ArrayQueue<Integer>(6);
		
		System.out.println("Max Size: " + aq1.getMaxSize());
		System.out.println("Length: " + aq1.getLength());
		System.out.println("isEmpty? " + aq1.isEmpty());
		System.out.println("isFull? " + aq1.isFull());
		System.out.println();
		
		System.out.println("Enqueuing 6 elements...");
		aq1.enqueue(54);
		aq1.enqueue(23);
		aq1.enqueue(1);
		aq1.enqueue(78);
		aq1.enqueue(90);
		aq1.enqueue(45);
		
		System.out.println();
		System.out.println("Max Size: " + aq1.getMaxSize());
		System.out.println("Length: " + aq1.getLength());
		System.out.println("Front: " + aq1.front());
		System.out.println("Back: " + aq1.back());
		System.out.println("isEmpty? " + aq1.isEmpty());
		System.out.println("isFull? " + aq1.isFull());
		System.out.println();
		
		System.out.println("Dequeuing 2 elements...");
		aq1.dequeue();
		aq1.dequeue();
		 
		System.out.println();
		System.out.println("Max Size: " + aq1.getMaxSize());
		System.out.println("Length: " + aq1.getLength());
		System.out.println("Front: " + aq1.front());
		System.out.println("Back: " + aq1.back());
		System.out.println("isEmpty? " + aq1.isEmpty());
		System.out.println("isFull? " + aq1.isFull());
		System.out.println();
		
		System.out.println("Clearing the queue...");
		aq1.clear();
		
		System.out.println();
		System.out.println("Max Size: " + aq1.getMaxSize());
		System.out.println("Length: " + aq1.getLength());
		System.out.println("isEmpty? " + aq1.isEmpty());
		System.out.println("isFull? " + aq1.isFull());
		System.out.println();
		
		////////// LINKEDQUEUE //////////
		System.out.println("===== LINKED QUEUE =====\n");
		LinkedQueue<Integer> lq1 = new LinkedQueue<Integer>();
		
		System.out.println("Length: " + lq1.getLength());
		System.out.println("isEmpty? " + lq1.isEmpty());
		System.out.println();
		
		System.out.println("Enqueuing 6 elements...");
		lq1.enqueue(54);
		lq1.enqueue(23);
		lq1.enqueue(1);
		lq1.enqueue(78);
		lq1.enqueue(90);
		lq1.enqueue(45);
		
		System.out.println();
		System.out.println("Length: " + lq1.getLength());
		System.out.println("isEmpty? " + lq1.isEmpty());
		System.out.println("Front: " + lq1.front());
		System.out.println("Back: " + lq1.back());
		System.out.println();
		
		System.out.println("Dequeuing 2 elements...");
		lq1.dequeue();
		lq1.dequeue();
		
		System.out.println();
		System.out.println("Length: " + lq1.getLength());
		System.out.println("isEmpty? " + lq1.isEmpty());
		System.out.println("Front: " + lq1.front());
		System.out.println("Back: " + lq1.back());
		System.out.println();
		
		System.out.println("Clearing the queue...");
		lq1.clear();
		
		System.out.println();
		System.out.println("Length: " + lq1.getLength());
		System.out.println("isEmpty? " + lq1.isEmpty());

		System.out.println("Program Ending...");
	} // main
}
