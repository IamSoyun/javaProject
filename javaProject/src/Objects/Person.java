package Objects;

public class Person {
	
	String name;
	int age;
	double height;
	double weight;
	
	Person(){}
	
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(name + "은 밥을 먹습니다");
	}
	
	void sleep() {
		System.out.println(name + "은 잡니다");
	}
	
	void walk() {
		System.out.println(name + "은 산책중입니다");
	}
	
	void introduce() {
		System.out.println("이름:" + name + ", 나이:" + age + ", 키:" + height + ", 몸무게: " + weight);
	}

}

//class PersonExample2 {
//	public static void main(String[] args) {
//		
//	}
//}

