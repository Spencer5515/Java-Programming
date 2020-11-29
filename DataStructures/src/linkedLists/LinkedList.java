package linkedLists;

public class LinkedList<T> {
	protected class Node {
		public T value;
		public Node next;
		
		public Node(T v) { value = v; }
	} // Node
	
	private Node head = null;
	private int length;
	
	public LinkedList() {
		head = null;
		length = 0;
	} // constructor
	
	public void clear() {
		Node prev = null;
		
		while (head != null) {
			prev = head;
			head = head.next;
		} // while
		
		length = 0;
	} // clear
	
	public T getElement(int position) {
		Node curr = head;
		
		for (int i = 0; i < position; i++) {
			curr = curr.next;
		} // for loop
		
		return curr.value;
	} // getElement
	
	public void append(T value) {
		Node n = new Node(value);
		
		if (head == null) {
			head = n;
		} // if
		else {
			Node curr = head;
			
			while (curr.next != null) {
				curr = curr.next;
			} // while
			
			curr.next = n;
		} // else
		
		length++;
	} // append
	
	public void insert(int position, T value) {
		if (position < 0 || position >= length) {
			System.out.println("ERROR: position out of bounds\n");
		} // if
		else {
			Node n = new Node(value);
			Node curr = head;
			Node prev = null;
			
			for (int i = 0; i < position; i++) {
				prev = curr;
				curr = curr.next;
			} // for loop
			
			if (prev != null) {
				prev.next = n;
			} // if
			else if (position == 0) {
				head = n;
			} // else if
			
			n.next = curr;
			length++;
		} // else
	} // insert
	
	public void remove(int position) {
		if (position < 0 || position >= length) {
			System.out.println("ERROR: position out of bounds\n");
		} // if
		else {
			if (head.next == null) {
				head = null;
			} // if
			else {
				Node curr = head;
				Node prev = null;
				
				for (int i = 0; i < position; i++) {
					prev = curr;
					curr = curr.next;
				} // for loop
				
				if (curr == head) {
					head = head.next;
				} // if
				else {
					prev.next = curr.next;
				} // else
				
				curr = null;
			} // else
			
			length--;
		} // else
	} // remove
	
	public void displayLL() {
		Node curr = head;
		
		if (head == null) {
			System.out.println("*List is empty*\n");
			return;
		} // if
		else {
			while (curr != null) {
				System.out.print(curr.value);
				
				if (curr.next != null) {
					System.out.print(" -> ");
				} // if
				
				curr = curr.next;
			} // while
			
			System.out.println();
		} // else
	} // displayLL
	
	public int getLength() { return length; } // getLength
	
	public boolean isEmpty() { return getLength() == 0; } //isEmpty
	
}


