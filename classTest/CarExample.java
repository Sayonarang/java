package classTest;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); //���� �ϱ� ���ؼ� new ������      Ŭ���� ���� ���� 
		System.out.println("����ȸ�� : "+ myCar.company);
		System.out.println("�𵨸� : "+ myCar.mode1);
		System.out.println("�������� : "+ myCar.color);
		myCar.color = "���"; //������ �ٲ� �� ���� 
		System.out.println("�������� : "+ myCar.color);
		System.out.println("�����ְ�ӵ� : "+ myCar.maxspeed);
		System.out.println("��������ӵ� : "+ myCar.speed);
		System.out.println("�õ�Ŀ����? : "+ myCar.power);
		
		myCar.speed = 60;
		System.out.println("��������ӵ� : "+ myCar.speed);
	}

}
