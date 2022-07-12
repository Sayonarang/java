import java.util.Collections; 
import java.util.Arrays; //정렬
import java.util.ArrayList;

public class SimpleLottoMachine2 {
	public static void main(String[] args) {
		//45개의 공을 만든다 integer의 줄임말 => int 정수
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=1; i<=45; i++) {
			numbers.add(i); // 1~45 
	}
	
	//섞는다
	Collections.shuffle(numbers);  //컬렉션  셔플 카드를 섞는 순서 
	//뽑는다
	
	
	//출력 결과 
	System.out.println(numbers.get(0));
	System.out.println(numbers.get(1));
	System.out.println(numbers.get(2));
	System.out.println(numbers.get(3));
	System.out.println(numbers.get(4));
	System.out.println(numbers.get(5));
	}
}
