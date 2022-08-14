
public class Fish implements Prey,Predator{
//큰 물고기가 작은 물고기를 먹는 경우가 있어서 두 템플릿 클래스 

	@Override
	public void hunt() {
		// 벼룩을 사냥할때 
		System.out.println("This fish is hunting smaller fish");
		
		
	}

	@Override
	public void flee() {
		// 이 물고기가 더 큰 물고기로 부터 도망친다
		System.out.println("This fish is fleeing from a larger fish");
		
	}	
	}
	

