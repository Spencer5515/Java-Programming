package queues;

public class LinkedQueue<T> {
	protected class Node {
		public T value;
		public Node next;
		
		public Node(T v) { value = v; }
	} // Node
	
	private int length;
	protected Node head, last;
	
	public LinkedQueue() {
		this.length = 0;
		head = null;
		last = null;
	} // constructor
	
	public T back() { return last.value; }
	
	public void clear() {
		Node prev = null;
		
		while (head != null) {
			prev = head;
			head = head.next;
		} // while
		last = head;
		
		this.length = 0;
	} // clear
	
	public void dequeue() {
		if (head == null) {
			System.out.println("ERROR: Queue is empty");
		} // if
		else {
			Node temp = head;
			head = head.next;
			
			if (head == null) {
				last = null;
			} // if
			
			temp = null;
		} // else
		this.length--;
	} // dequeue
	
	public void enqueue(T elem) {
		Node n = new Node(elem);
		
		if (last == null) {
			head = last = n;
		} // if
		else {
			last.next = n;
			last = n;
		} // else
		
		this.length++;
	} // enqueue
	
	public T front() { return head.value; }

	public int getLength() { return this.length; }
	
	public boolean isEmpty() { return this.length == 0; }
	
}
