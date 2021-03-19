package student0312;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Student[] studentList = new Student[100]; 
		// Student = 이름, 나이, 휴대폰번호
		
		while (run) {

			int ans;

			System.out.println("-------------------------------------");
			System.out.println("1.등록 2.수정(휴대폰번호) 3.삭제 4.리스트 0.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 > ");
			ans = sc.nextInt(); sc.nextLine(); 
			
			if(ans == 1) { //등록
				
				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("나이 > ");
				int age = sc.nextInt(); sc.nextLine();
				System.out.print("휴대폰 번호 > ");
				String phone = sc.nextLine();
				
				for(int i = 0 ; i < studentList.length ; i++ ) {
					if(studentList[i] == null) {
						studentList[i] = new Student(name, age, phone);
						System.out.println("등록되었습니다.");
						break;
					}
				}
				
			}else if(ans == 2) { //수정(휴대번호)
				
				System.out.print("수정할 학생 이름 입력 > ");
				String name = sc.nextLine();
				
				for(Student std : studentList) {
					if(std != null && name.equals(std.getStudentName())) {
						System.out.println(std.toString());
						System.out.print("변경된 번호 > ");
						String setPhone = sc.nextLine();
						std.setStudentPhone(setPhone);
						System.out.println("변경되었습니다.");
					}
						
				}
				
			}else if(ans == 3) { //삭제
				
				System.out.print("삭제할 학생 이름 입력 > ");
				String name = sc.nextLine();
				
				for(int i = 0 ; i < studentList.length ; i++) {
					if(studentList[i] != null && name.equals(studentList[i].getStudentName())) {
						System.out.println(studentList[i].toString());
						studentList[i] = null;
						System.out.println("위 학생의 정보가 삭제되었습니다.");
					}
						
				}
				
				
			}else if(ans == 4) { //리스트
				
				for(Student std : studentList) {
					if(std != null)
						System.out.println(std.toString());
				}
				
			}else if(ans == 0) {
				System.out.println("종료되었습니다.");
				run = false;
			}
		}
			
	}
}
