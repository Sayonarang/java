
public class no2 {

	public static void main(String[] args) {
		int[] score = {50,89,78,98,99};
		
		int[] score2 = new int[5];
		
		int[] score3 = null;//�ʱ�ȭ new �����ڷ� �� �ֱ�
		score3 = new int[] {98,65,78,56,91}; 
		
		int sum = 0;
		for(int i=0;i<5;i++) { //�迭 
			sum += score[i];
			
		}
		System.out.println("����: " +sum); 

	}

}
