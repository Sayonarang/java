package EnumTest;

import java.util.Calendar;


public class EnumWeekTest {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance(); 
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(day); //��1 ��2 ȭ3 ..
		//today = Week.FRIDAY;
		//System.out.println(today);
		
		switch(day) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("������" + today + "�Դϴ�.");
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� ǫ ��ϴ�.");
		}else {
			System.out.println("������ �ڹٸ� ���� �մϴ�.");
		}
	}

}
