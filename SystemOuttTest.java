package systemout;

public class SystemOuttTest {

	public static void main(String[] args) {
		System.out.print("����"); //��ȣ ���� ������ ��¸� �ض�  
		System.out.println("����"); //��ȣ ���� ������ ����ϰ� ���� �ٲ��
		System.out.printf("����");//��ȣ���� ù ��° ���ڿ� ���Ĵ�� ���� ��� 


		// %d %f %s 
		int value = 500;
		System.out.printf("��ǰ�� ����: %d��\n",value);
		System.out.printf("��ǰ�� ����: %010d��\n",value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %10.2f",10,area);

		String name = "���¹�";
		String job = "��ġ��";
		System.out.printf("%6d| %-10s| %10s",1,name,job);
		
		
		
		
		
		
		
		
		
		
	}

}
