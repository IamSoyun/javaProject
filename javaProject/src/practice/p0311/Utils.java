package practice.p0311;

public class Utils {
	
	public <T> Box<T> boxing(T t){
		
		Box<T> box = new Box<>();
		box.setBox(t);
		return box;
	}
	
}
