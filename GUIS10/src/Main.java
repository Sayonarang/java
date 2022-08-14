//인터페이스 사용 
public class Main {

	public static void main(String[] args) {
		// 인터페이스 만드는 방법
		
		/*Rabbit rabbit = new Rabbit();
		//결과 토끼가 도망가고 있습니다.
		rabbit.flee();
		 */
		
		/*Hawk hawk = new Hawk(); //매가 새 매와 같도록 
		
		hawk.hunt();
		*/
		
		Fish fish = new Fish();
		fish.hunt(); //큰 물고기가 작은
		fish.flee(); //작은 물고기가 도망
	}

}
