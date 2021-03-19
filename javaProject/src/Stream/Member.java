package Stream;

public class Member {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode() + this.getSex() + this.getAge();
	}

	@Override
	public boolean equals(Object obj) {
		Member m =null;
		if(obj instanceof Member) {
			m = (Member) obj;
		}else {
			return false;
		}
		
		return m.hashCode() == this.hashCode();
	}
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getMale() {
		return MALE;
	}

	public static int getFemale() {
		return FEMALE;
	}
	
	
}
