
public class Main {

	public static void main(String[] args) {
/*
		String[] cars = {"�׽���","����","���"}; //cars �̶�� ������ ���ڿ� 
		
		cars[0] = "��������";
		
		System.out.println(cars[0]);
	*/
		
		String[] cars = new String[3];
		
		cars[0] = "�׽���";
		cars[1] = "����";
		cars[2] = "���";
		
		//System.out.println(cars[0]);
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	
	}

}
