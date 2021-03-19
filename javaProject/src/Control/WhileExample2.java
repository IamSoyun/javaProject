package Control;

public class WhileExample2 {

	public static void main(String[] args) {

		int stage = 1;

		while (stage <= 9)
			multiple(stage++);

	}

	public static void multiple(int stage) {

		int num = 1;
		while (num <= 9) {
			System.out.println(stage + " * " + num + " = " + stage * num);
			num++;
		}

	}

}
