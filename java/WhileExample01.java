
public class WhileExample01 {

	public static void main(String[] args) {
		// �ݺ��� do~ while�� (������ �ѹ��� ����)
		// 1���� 100������ �� 
		int i = 1;
		int sum = 0; 
		do {
			sum += i; 
			i++;
		}while(i<=1000);
		System.out.printf("1~%d�� ��: %d",i,sum);
	}

}
