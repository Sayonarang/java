import java.util.Collections; 
import java.util.Arrays; //����
import java.util.ArrayList;

public class SimpleLottoMachine {
	public static void main(String[] args) {
		//45���� ���� ����� integer�� ���Ӹ� => int ����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=1; i<=45; i++) {
			numbers.add(i); // 1~45 
	}
	
	//���´�
	Collections.shuffle(numbers);  //�÷���  ���� ī�带 ���� ���� 
	//�̴´�
	int[] picked = new int[6];
	for (int i=0; i<6; i++) { // numbers�� �� 6�� ���ڸ� ������
		picked[i] = numbers.get(i); //picked �̾Ҵ� 
	}
	
	//��� ��� 
	System.out.printf("�ڵ� ���� ��ȣ: %s", Arrays.toString(picked)); //args(arguments)�� �Լ����� �������� ����, n���� ���� �� ����մϴ�.
	}
}
