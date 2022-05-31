
public class no2 {

	public static void main(String[] args) {
		int[] score = {50,89,78,98,99};
		
		int[] score2 = new int[5];
		
		int[] score3 = null;//초기화 new 연산자로 값 넣기
		score3 = new int[] {98,65,78,56,91}; 
		
		int sum = 0;
		for(int i=0;i<5;i++) { //배열 
			sum += score[i];
			
		}
		System.out.println("총점: " +sum); 

	}

}
