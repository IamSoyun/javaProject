package practice.p0308;

public class SchoolFriend extends Friend {
	
	String schoolInfo;
	public SchoolFriend(String name, String number, String schoolInfo) {
		super(name, number);
		this.schoolInfo = schoolInfo;
	}
	
	@Override
	public String toString() {
		return "SchoolFriend [schoolInfo=" + schoolInfo + ", name=" + super.getName() + ", number=" + super.getNumber() + "]";
	}
	
}
