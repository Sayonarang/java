public class ArrayExc01 {

	public static void main(String[] args) {
		int[] score = {100,95,87,65,74}; 
		System.out.println(score.length);
		
		int sum = 0, avg = 0;//�迭�� �հ�
		for(int i : score) //�迭 �� ��ŭ �ݺ� ���� for��
			sum += i; //6�� ����
		    System.out.println("����: "+sum);
		    avg = sum/score.length;
		    System.out.println("���: "+avg);
		//for(int i=0; i<score.length; i++)
			/*System.out.println(score[i]);*/
	}
		

}
