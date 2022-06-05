package systemout;

public class SystemTnTest2 {

	public static void main(String[] args) throws Exception{
		int keyCode; 
		
		//q 키를 누르면 종료되는 프로그램 
		while(true) {
			keyCode = System.in.read();
			System.out.print("keyCode: " +keyCode);
			if(keyCode == 113) {
				break;
				
			}
		
		}
		System.out.println("종료");
		
		
		
		
	}

}
