package practice.p0310;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {

		//비프음 5번 이후 "띵" 출력 5번함
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) { // 비프음 

			toolkit.beep();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		for (int i = 0; i < 5; i++) { // 출력
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			
		}
		
		
	}

}
