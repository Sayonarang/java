
public class ArrayExample02 {

	public static void main(String[] args) {
		//int[] score = null; //방안에 몇개인지 초기화 
		int[] score = {50,89,78,98,99}; //배열 값으로 초기화
		
		int[] score2 = new int[5];
		
		int[] score3 = null;//초기화 new 연산자로 값 넣기
		score3 = new int[] {98,65,78,56,91}; //null 값 추가 
		
		int sum = 0;
		for(int i=0;i<5;i++) { //배열 
			sum += score[i];
			
		}
		System.out.println("총점: " +sum); 
		
		int sum2 =add(new int[] {99,56,74}); //배열 넘기기 add매소드 끝나면 나한테 하나를 돌려줌
		System.out.println("총점2: " +sum2); 
		
		
	}
	public static int add(int[] score) { //add매소드 int타입에 배열을 받아서 총점 구하는것 다시 돌려줌 
		int sum = 0;
		for(int i=0;i<3;i++) { //배열 
			sum += score[i];
		}
		return sum;
	}
		

}
