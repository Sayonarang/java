
public class ArrayExample01 {

	public static void main(String[] args) {
		//�迭���� ���� ��� ���ϱ� 
		// TODO Auto-generated method stub
		int[] score= {51,89,94,65,84}; 
		int sum = 0;
		for(int i = 0; i<5; i++) {
			sum += score[i];
		}
		System.out.println("����: " + sum);
		int avg = sum/5;
		System.out.println("���: " + avg);

	}

}
