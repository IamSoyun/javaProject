package academy;

public class Student {

	private int stdId;
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private int stdScore;
	
	public Student(int stdId, String stdName, int stdAge, String stdPhone, int stdScore) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
		this.stdScore = stdScore;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public int getStdScore() {
		return stdScore;
	}

	public void setStdScore(int stdScore) {
		this.stdScore = stdScore;
	}

	@Override
	public String toString() { // 학번 앞에 0 붙여주려고 안씀,,
		return stdId + "/" + stdName + "/" + stdAge + "/" + stdPhone
				+ "/" + stdScore;
	}
	

	
}
