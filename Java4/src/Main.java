import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		사용자가 개 고양이를 원하는지 입력하도록 하고 특정 형식의 해당 유형의 객체를 인스턴스화 
		Scanner scanner = new Scanner(System.in); //괄호 안에 시스템 도트를 입력
		Animal animal; //동물 cat dog를 선언을 해야하는데 어떤 것인지 몰라서 동물을 원한다만 선언
		
		System.out.println("어떤 동물을 원하시나요?"); //사용자를 위한 프롬프트 생성 
		System.out.print("(1=dog) or (2=cat): ");
		//사용자에게 선택권을 줌 숫자를 저장할 것이기 때문에 정수 생성
		int choice = scanner.nextInt();
		
		if(choice==1) { //같으면 동물 객체를 가져오고 끝낼 것  choice 선택
			animal = new Dog();
			animal.speak();
		}
		
		else if(choice==2) { //같으면 동물 객체를 가져오고 끝낼 것 
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("선택이 잘못되었습니다.");
			animal.speak();
		}
		
		
		
	
	
	}

}
