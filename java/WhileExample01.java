
public class WhileExample01 {

	public static void main(String[] args) {
		// 반복문 do~ while문 (무조건 한번은 실행)
		// 1부터 100까지의 합 
		int i = 1;
		int sum = 0; 
		do {
			sum += i; 
			i++;
		}while(i<=1000);
		System.out.printf("1~%d의 합: %d",i,sum);
	}

}
