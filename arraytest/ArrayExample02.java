
public class ArrayExample02 {

	public static void main(String[] args) {
		//int[] score = null; //��ȿ� ����� �ʱ�ȭ 
		int[] score = {50,89,78,98,99}; //�迭 ������ �ʱ�ȭ
		
		int[] score2 = new int[5];
		
		int[] score3 = null;//�ʱ�ȭ new �����ڷ� �� �ֱ�
		score3 = new int[] {98,65,78,56,91}; //null �� �߰� 
		
		int sum = 0;
		for(int i=0;i<5;i++) { //�迭 
			sum += score[i];
			
		}
		System.out.println("����: " +sum); 
		
		int sum2 =add(new int[] {99,56,74}); //�迭 �ѱ�� add�żҵ� ������ ������ �ϳ��� ������
		System.out.println("����2: " +sum2); 
		
		
	}
	public static int add(int[] score) { //add�żҵ� intŸ�Կ� �迭�� �޾Ƽ� ���� ���ϴ°� �ٽ� ������ 
		int sum = 0;
		for(int i=0;i<3;i++) { //�迭 
			sum += score[i];
		}
		return sum;
	}
		

}
