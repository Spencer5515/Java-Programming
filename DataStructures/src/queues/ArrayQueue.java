package queues;

public class ArrayQueue<T> {
		private T[] buffer;
		private int length;
		private int maxSize;
		private int frontIndex;
		private int backIndex;
		
	public ArrayQueue(int i) {
		maxSize = i;
		frontIndex = 0;
		backIndex = maxSize - 1;
		this.length = 0;
		
		@SuppressWarnings("unchecked") // creates new array
		T[] tempBuffer = (T[]) new Object[maxSize];
		buffer = tempBuffer;
	} // constructor
	
	public T back() {
		if (isEmpty()) {
			System.out.println("ERROR: queue is empty");
		} // if
		
		return buffer[backIndex];
	} // back
	
	public void clear() {
		this.length = 0;
		frontIndex = 0;
		backIndex = maxSize - 1;
		
		buffer = null;
		this.length = 0;
	} // clear
	
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("ERROR: queue is empty");
		} // if
		else {
			frontIndex = (frontIndex + 1)  % maxSize;
			this.length--;
		} // else
	} // dequeue
	
	public void enqueue(T elem) {
		if (isFull()) {
			System.out.println("ERROR: queue is full");
		} // if
		else {
			if (buffer == null) {
				@SuppressWarnings("unchecked") // creates new array
				T[] tempBuffer = (T[]) new Object[maxSize];
				buffer = tempBuffer;
			} // if
			
			backIndex = (backIndex + 1) % maxSize;
			buffer[backIndex] = elem;
			this.length++;
		} // else
	} // enqueue
	
	public T front() {
		if (isEmpty()) {
			System.out.println("ERROR: queue is empty");
		} // if
		
		return buffer[frontIndex];
	} // front
	
	public int getLength() { return this.length; }
	
	public int getMaxSize() { return maxSize; }
	
	public boolean isEmpty() { return this.length == 0; }
	
	public boolean isFull() { return this.length == maxSize; }
	
}
