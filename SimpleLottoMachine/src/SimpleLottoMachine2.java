import java.util.Collections; 
import java.util.Arrays; //����
import java.util.ArrayList;

public class SimpleLottoMachine2 {
	public static void main(String[] args) {
		//45���� ���� ����� integer�� ���Ӹ� => int ����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=1; i<=45; i++) {
			numbers.add(i); // 1~45 
	}
	
	//���´�
	Collections.shuffle(numbers);  //�÷���  ���� ī�带 ���� ���� 
	//�̴´�
	
	
	//��� ��� 
	System.out.println(numbers.get(0));
	System.out.println(numbers.get(1));
	System.out.println(numbers.get(2));
	System.out.println(numbers.get(3));
	System.out.println(numbers.get(4));
	System.out.println(numbers.get(5));
	}
}
