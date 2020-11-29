package abstractClasses;

public abstract class Machine { // Machine class is now ONLY a base class
	private int id;
	
	public abstract void start(); // same as in C++ when adding ' = 0;'
	public abstract void doStuff();
	public abstract void shutDown();
	
	public void run() { 
		start(); 
		doStuff();
		shutDown();
	}

	public int getId() { return id; }

	public void setId(int i) { id = i; }
		
}
