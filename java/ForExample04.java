
public class ForExample04 {

	public static void main(String[] args) {
		// 반복문 구구단 2단만 출력  
		//for(int m = 1; m<10 ;m++) {
			//System.out.printf("2 * %d = %d\n", m, 2*m);
				
		//}
		for(int m = 2; m<10 ;m++) {
			System.out.printf("### %d단 ###\n",m);
			for(int n = 1 ; n<=10 ; n++)
			System.out.printf("%d * %d = %d\n",m,n,m*n);
		}
			
	}

}
