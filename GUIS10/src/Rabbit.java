
public class Rabbit implements Prey{

//	추가해야 하는 토끼 클래스 내에서 구현되지 않은 모든 메서드는 기본적 flee이라는 메서드를 재정
	@Override
	public void flee() {
		System.out.println("*The rabbit is fleeing*"); //토끼가 도망가고 있음을 나타냄
		
	} //인터페이스를 구현 가정 Prey

}
