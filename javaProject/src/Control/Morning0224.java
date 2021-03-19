package Control;

public class Morning0224 {

	public static void main(String[] args) {

		int eng = (int) (Math.random() * 100 + 1);
		int kor = (int) (Math.random() * 100 + 1);
		
		System.out.println("영어: " + eng + " 수학: " + kor + " 성적: " + getAverage(eng, kor));

	}

	public static String getAverage(int n1, int n2) {

		String score;

		switch ((n1 + n2) / 2 / 10) {
		case 9: case 10:
			score = "수";
			break;
		case 8:
			score = "우";
			break;
		case 7:
			score = "미";
			break;
		default:
			score = "가";
		}

		return score;
		
	}

}
