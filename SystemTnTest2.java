package systemout;

public class SystemTnTest2 {

	public static void main(String[] args) throws Exception{
		int keyCode; 
		
		//q Ű�� ������ ����Ǵ� ���α׷� 
		while(true) {
			keyCode = System.in.read();
			System.out.print("keyCode: " +keyCode);
			if(keyCode == 113) {
				break;
				
			}
		
		}
		System.out.println("����");
		
		
		
		
	}

}
