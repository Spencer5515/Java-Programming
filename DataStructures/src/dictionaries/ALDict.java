package dictionaries;

public class ALDict<Key, Val> {
	protected class Record {
		Key k;
		Val v;
		
		public Record(Key k, Val v) {
			this.k = k;
			this.v = v;
		} // Record
		
		public Key getK() { return k; }
		
		public Val getV() { return v; }
	} // Record
	
	ArrayList<Record> list;
	
	ALDict(int i) { list = new ArrayList<Record>(i); } // constructor
	
	public void clear() { list.clear(); }
	
	public int find(Key target) {
		for (int i = 0; i < list.getLength(); i++) {
			Key temp = list.getElement(i).k;
			
			if (temp == target) { // doesnt work
				return i;
			} // if
		} // for loop
		
		System.out.println("ERROR: unable to find record");
		return -1;
	} // find
	
	public void insert(Key x, Val y) { 
		list.append(new Record(x, y)); 
	} // insert
	
	public void remove(Key target) {
		boolean flag = false;
		
		for (int i = 0; i < list.getLength(); i++) {
			Key temp = list.getElement(i).k;
			
			if (temp == target) { // doesnt work
				list.remove(i);
				flag = true;
				break;
			} // if
		} // for loop
		
		if (!flag) {
			System.out.println("Unable to find/remove record with matching Key");
		} // if
	} // remove
	
	public int size() { return list.getLength(); }
	
	public boolean isEmpty() { return size() == 0; }
	
}
