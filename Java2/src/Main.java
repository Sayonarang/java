
public class Main {

	public static void main(String[] args) {
/*
		String[] cars = {"테슬라","현대","기아"}; //cars 이라는 간단한 문자열 
		
		cars[0] = "누구세요";
		
		System.out.println(cars[0]);
	*/
		
		String[] cars = new String[3];
		
		cars[0] = "테슬라";
		cars[1] = "현대";
		cars[2] = "기아";
		
		//System.out.println(cars[0]);
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	
	}

}
