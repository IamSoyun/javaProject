package practice.p0311;

public class BoxExample {
	public static void main(String args[]) {
		
		Utils utils = new Utils();
		
		Box<Integer> box1 = utils.<Integer>boxing(100);
		int inValue = box1.getBox();
		
		Box<String> box2 = utils.boxing("홍길동");
		String strValue = box2.getBox();
		
	}

}
