package monday8th;
import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {
	private UUID key;


	public Key() {
		this.key = UUID.randomUUID();
	}
	
	// copy constructor
	public Key(Key original) {
		this.key = original.key;	
	}
	
	@Override
	public String toString() {
		return key.toString();
	}

	public static void main(String[] args) {
		Key k = new Key();

		System.out.println(k.key);
	}
	
//	@Override 
	
	
	@Override
	public int hashCode() {
		return this.key.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!this.getClass().isInstance(obj)) {
			return false;
		}
		else {
			Key other = (Key)obj;
			return key.equals(other.key);
		}
	}
	
	@Override
	public int compareTo(Key o) {
		return this.key.compareTo(o.key);
	}
}
