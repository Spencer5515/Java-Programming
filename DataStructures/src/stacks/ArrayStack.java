package stacks;

public class ArrayStack<T> {
	private T[] buffer;
	private int maxSize;
	private int topPosition;
	private int length;
	
	ArrayStack(int i) {
		length = 0;
		maxSize = i;
		topPosition = -1;
		
		@SuppressWarnings("unchecked") // creates new array
		T[] tempBuffer = (T[]) new Object[maxSize];
		buffer = tempBuffer;
	} // constructor
	
	public void clear() {
		length = 0;
		topPosition = -1;
		buffer = null;
	} // clear
	
	public void pop() {
		if (isEmpty()) {
			System.out.println("ERROR: stack is empty");
		} // if
		else {
			topPosition--;
			length--;
		} // else
	} // pop
	
	public void push(T elem) {
		if (isFull()) {
			System.out.println("ERROR: stack is full");
		} // if
		else {
			buffer[++topPosition] = elem;
			length++;
		} // else
	} // push
	
	public T top() {
		if (isEmpty()) {
			System.out.println("ERROR: stack is empty");
		} // if
		
		return buffer[topPosition];
	} // top
	
	public int getLength() { return length; }
	
	public int getMaxSize() { return maxSize; }
	
	public boolean isEmpty() { return length == 0; }
	
	public boolean isFull() { return length == maxSize; }

}
