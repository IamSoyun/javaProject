package References;

public class Morning0226_4 {

	public static void main(String[] args) {

		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + ": ");
			System.out.println(scores[i]);
		}

		for (String name : names) {
			System.out.print(name + " ");
		}

		int sum = 0;

		for (int score : scores)
			sum += score;

		System.out.println(sum);

	}

}
