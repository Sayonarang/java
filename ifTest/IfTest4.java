package test;

public class IfTest4 {

	public static void main(String[] args) {
		// 조건문
		int score = 79;
		
		
		if(score >=90) {
			System.out.printf("점수가 %d점 입니다\n");
			System.out.println("등급이 A입니다");
		} else if(score >= 80) {		
			System.out.printf("점수가 %d점 입니다\n");
			System.out.println("등급이 B입니다");
		}else if(score >= 70) {		
			System.out.printf("점수가 %d점 입니다\n");
			System.out.println("등급이 C입니다");
		}else if(score >= 60) {		
			System.out.printf("점수가 %d점 입니다\n");
			System.out.println("등급이 D입니다");
		}else{		
			System.out.printf("점수가 %d점 입니다\n");
			System.out.println("등급이 F입니다");
		}
			
		
		
	
	
	
	
	}

}
