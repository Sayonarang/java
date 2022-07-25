
public class Main {

	public static void main(String[] args) {


		String[][] cars = new String[3][3] ; //행과 열 나열 
			
		String[][] cars = {
				{"사과","레몬","바나나"}
				,"파인애플","자두","사과"},"용과","망고","복숭아",
		}
		
		cars[0][1] = "사과";
		cars[0][2] = "레몬";
		cars[1][0] = "바나나";
		cars[1][1] = "파인애플";
		cars[1][2] = "자두";
		cars[2][0] = "용과";
		cars[2][1] = "망고";
		cars[2][2] = "복숭아";
		
		//중첩 for 
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			
		}
	}

}
