package dictionaries;

public class ArrayList<T> {
	private T[] buffer;
	private int length;
	private int maxSize;
	
	public ArrayList(int i) {
		this.length = 0;
		maxSize = i;
		
		@SuppressWarnings("unchecked") // creates new array
		T[] tempBuffer = (T[]) new Object[maxSize];
		buffer = tempBuffer;
	} // constructor
	
	public void append(T elem) {
		if (isFull()) {
			System.out.println("ERROR: list is full");
		} // if
		else {
			if (buffer == null) {
				@SuppressWarnings("unchecked") // creates new array
				T[] tempBuffer = (T[]) new Object[maxSize];
				buffer = tempBuffer;
			} // if
			
			buffer[this.length] = elem;
			this.length++;
		} // else
	} // append
	
	public void clear() {
		buffer = null;
		this.length = 0;
	} // clear
	
	public T getElement(int position) {
		if (position < 0 || position >= this.length) {
			System.out.println("ERROR: position out of bounds");
		} // if
		
		return buffer[position];
	} // getElement
	
	public void insert(int position, T elem) {
		if (position < 0 || position >= this.length) {
			System.out.println("ERROR: position out of bounds");
		} // if
		else if (isFull()) {
			System.out.println("ERROR: list is full");
		} // else if
		else {
			for (int i = this.length; i > position; i--) {
				buffer[i] = buffer[i - 1];
			} // for loop
			
			buffer[position] = elem;
			this.length++;
		} // else
	} // insert
	
	public void remove(int position) {
		if (position < 0 || position >= this.length) {
			System.out.println("ERROR: position out of bounds");
		} // if
		else {
			for (int i = position; i < this.length - 1; i++) {
				buffer[i] = buffer[i + 1];
			} // for loop
			
			this.length--;
		} // else
	} // remove
	
	public void replace(int position, T elem) {
		if (position < 0 || position >= this.length) {
			System.out.println("ERROR: position out of bounds");
		} // if
		else {
			buffer[position] = elem;
		} // else
	} // replace
	
	public int getLength() { return this.length; }
	
	public int getMaxSize() { return maxSize; }
	
	public boolean isEmpty() { return this.length == 0; }
	
	public boolean isFull() { return this.length == maxSize; }
	
}

