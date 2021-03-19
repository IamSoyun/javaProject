package java0318;

public class Student {
	
	String name;
	int EngScore;
	int mathScore;
	
	public Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		EngScore = engScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEngScore() {
		return EngScore;
	}
	public void setEngScore(int engScore) {
		EngScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	@Override
	public String toString() {
		return "[" + name + ". 영어: " + EngScore + ", 수학: " + mathScore + "]";
	}
	
	
}
