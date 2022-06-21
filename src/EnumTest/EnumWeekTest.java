package EnumTest;

import java.util.Calendar;


public class EnumWeekTest {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance(); 
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(day); //일1 월2 화3 ..
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
		System.out.println("오늘은" + today + "입니다.");
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 푹 잡니다.");
		}else {
			System.out.println("열심히 자바를 공부 합니다.");
		}
	}

}
