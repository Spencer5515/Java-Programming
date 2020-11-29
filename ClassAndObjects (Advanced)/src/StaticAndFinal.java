class Thing {
	public final static int LUCKY_NUM = 7; // final in Java == const in C++
	
	public String name; // non-static
	public static String descript; // class variable
	public int id;
	
	// static int is same for all objects
	public static int cnt = 0; // increments +1 for every new object

	public Thing() {
		id = cnt;
		cnt++;
	} // constructor
	
	public void showName() {
		System.out.println("Object ID: " + id + ", " + descript + ": " + name);
		// instance data (id), static data (descript), instance data (name)
	}
	
	public static void showInfo() {
		System.out.println("Hello");
		//System.out.println(name); // cannot make static reference to non-static
	}
}

public class StaticAndFinal {
	
	public static void main(String[] args) {
		Thing.showInfo();
		Thing.descript = "I am a thing";
		System.out.println(Thing.descript);
		System.out.println();
		
		System.out.println("ctr (before): " + Thing.cnt);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("ctr (after): " + Thing.cnt);
		
		System.out.println();	
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		// dealing with statics
		System.out.println();
		System.out.println("Final static is: " + Thing.LUCKY_NUM); // access final static
		// value cannot change / is always 7
		
		System.out.println();
		System.out.println("PI is: " + Math.PI); // accessing constant 'PI' via Math.class
		
	} // main
}
