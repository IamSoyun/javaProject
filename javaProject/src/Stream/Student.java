package Stream;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		return this.getScore() - o.getScore();
	}
	
	
	
	// -가 나오면 이 순서대로 오름차순
}
