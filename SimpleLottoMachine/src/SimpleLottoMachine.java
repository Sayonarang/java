import java.util.Collections; 
import java.util.Arrays; //정렬
import java.util.ArrayList;

public class SimpleLottoMachine {
	public static void main(String[] args) {
		//45개의 공을 만든다 integer의 줄임말 => int 정수
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=1; i<=45; i++) {
			numbers.add(i); // 1~45 
	}
	
	//섞는다
	Collections.shuffle(numbers);  //컬렉션  셔플 카드를 섞는 순서 
	//뽑는다
	int[] picked = new int[6];
	for (int i=0; i<6; i++) { // numbers의 앞 6개 숫자를 가져옴
		picked[i] = numbers.get(i); //picked 뽑았다 
	}
	
	//출력 결과 
	System.out.printf("자동 생성 번호: %s", Arrays.toString(picked)); //args(arguments)는 함수에서 여러개의 인자, n개를 받을 때 사용합니다.
	}
}
