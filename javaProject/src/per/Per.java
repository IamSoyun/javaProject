package per;

import java.util.Random;
import java.util.Scanner;

public class Per {
	
	static int money = 100000000;
	static int percent = 0;
	static char an;
	
	static String[] list = {"��", "Ȱ", "����"};
	static int[] state = {0,0,0};
	
	
	public static void main(String[] args) {
		

		do {
			
			Scanner sc = new Scanner(System.in);
			int choice;
			
			System.out.printf("%n�������: %dG%n",money);
			for(int i=0 ; i<list.length ; i++) {
				System.out.printf("%d.%s+%d%n",i+1,list[i],state[i]);
			}
			
			System.out.printf("%n�������� ��ȭ�Ͻðڽ��ϱ�?%n");
			an = sc.next().charAt(0);
			

			if(an == 'y') {
				
				System.out.printf("%n� �������� ��ȭ�Ͻðڽ��ϱ�? (��ȣ�Է�)%n");
				
				for(int i=0 ; i<list.length ; i++) {
					System.out.printf("%d.%s+%d%n",i+1,list[i],state[i]);
				}
				
				choice = sc.nextInt()-1;
					
				do {
					
					state[choice] = reinforce(state[choice]);
					
				}while(an == 'y');
				
				
			}
			

			
			
		}while(true);
		
		


		
		
	}
	
	
	//��ȭ
	public static int reinforce(int weaponstate) {
		
		percent = 100 - weaponstate*5;
		int fee = 10*weaponstate;
		
		System.out.println("���: " + fee + " �ܰ�: " + money );
		System.out.println(percent + "�� Ȯ���Դϴ�. ��ȭ�Ͻðڽ��ϱ�?" );
		Scanner sc = new Scanner(System.in);
		
		an = sc.next().charAt(0);
		
		if(an == 'y') {
			
			money -= fee;
			
			if( (int) (Math.random() * 100 + 1) < percent) {
				
				System.out.print("��ȭ����! " + weaponstate + " > ");
				weaponstate++;
				System.out.println(weaponstate);
				
			}else {
				
				System.out.print("��ȭ����! " + weaponstate + " > ");
				weaponstate--;
				System.out.println(weaponstate);
				
			}
			
		}
		
		percent = 100 - weaponstate*10;
		return weaponstate;
	
	}


}
