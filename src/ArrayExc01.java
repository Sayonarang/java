public class ArrayExc01 {

	public static void main(String[] args) {
		int[] score = {100,95,87,65,74}; 
		System.out.println(score.length);
		
		int sum = 0, avg = 0;//배열의 합계
		for(int i : score) //배열 값 만큼 반복 향상된 for문
			sum += i; //6번 실행
		    System.out.println("총점: "+sum);
		    avg = sum/score.length;
		    System.out.println("평균: "+avg);
		//for(int i=0; i<score.length; i++)
			/*System.out.println(score[i]);*/
	}
		

}
