package systemout;

public class SystemOuttTest {

	public static void main(String[] args) {
		System.out.print("연습"); //괄호 안의 내용을 출력만 해라  
		System.out.println("연습"); //괄호 안의 내용을 출력하고 행을 바꿔라
		System.out.printf("연습");//괄호안의 첫 번째 문자열 형식대로 내용 출력 


		// %d %f %s 
		int value = 500;
		System.out.printf("상품의 가격: %d원\n",value);
		System.out.printf("상품의 가격: %010d원\n",value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f",10,area);

		String name = "류승민";
		String job = "정치인";
		System.out.printf("%6d| %-10s| %10s",1,name,job);
		
		
		
		
		
		
		
		
		
		
	}

}
