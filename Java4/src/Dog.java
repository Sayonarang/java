
public class Dog extends Animal{ //동물 클래스 생성 
	
	@Override //연습하다 메모를 추가
	//일반 speak 메서드와 비교 연결된 speak 메서ㄷ를 사용할 것이라고 알림 
	public void speak() { //이 동물이 동물의 유형과 관련된 무언가를 말할 수 있도록 
		System.out.println("dog goes *멍멍*");
	}

}
