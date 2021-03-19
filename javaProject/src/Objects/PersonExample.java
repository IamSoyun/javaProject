package Objects;

public class PersonExample {
	public static void main(String[] args) {
		
		Person[] persons = new Person[5];
		
		persons[0] = new Person("홍길동", 25, 172, 69);
		persons[1] = new Person("이길동", 30, 175, 78);
		persons[2] = new Person("김길동", 27, 168, 60);
		persons[3] = new Person("최길동", 32, 177, 88);
		persons[4] = new Person("박길동", 22, 169, 73);
		
		for(Person person : persons) {
			person.introduce();
		}
	}

}
